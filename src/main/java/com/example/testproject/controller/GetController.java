package com.example.testproject.controller;

import com.example.testproject.DTO.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // RESTful 컨트롤러임을 암시
@RequestMapping("api/v1/get-api") // 공통 URL 지정

public class GetController {
    // api/v1/get-api/hello
    @GetMapping("hello")
    public String getHello() {
        return "Hello World";
    }

    // api/v1/get-api/name
    @GetMapping("name")
    public String getName() {
        return "l22hs";
    }

    // api/v1/get-api/name/variable1/{String 값}
    @GetMapping("variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // api/v1/get-api/name/variable2/{String 값}
    @GetMapping("/variable2/{variable}")
    // 변수와 다른 이름을 사용
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    /*
    api/v1/get-api/request1?
    name=&
    email=&
    organization=&
     */
    @GetMapping("request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    // 파라미터 개수 지정 x
    @GetMapping("request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + '\n');
        });

        return sb.toString();
    }

    @GetMapping("request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
