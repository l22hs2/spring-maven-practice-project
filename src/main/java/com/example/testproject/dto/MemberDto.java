package com.example.testproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {
    private String name;
    private String email;
    private String organization;
}