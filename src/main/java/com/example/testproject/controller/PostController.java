package com.example.testproject.controller;

import com.example.testproject.dto.MemberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/post-api")
public class PostController {

    // api/v1/post-api/default
    @PostMapping("default")
    public String postMethod() {
        return "Hello World";
    }

    // api/v1/post-api/member
    @PostMapping("member")
    public String postMember(@RequestBody Map<String, Object> postData) { // value는 어떠한 값이 들어올지 모르니 Object로 설정
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    // api/v1/post-api/member2
    @PostMapping("member2")
    public String postMemberDto(@RequestBody MemberDto memberDTO) {
        return memberDTO.toString();
    }
}
