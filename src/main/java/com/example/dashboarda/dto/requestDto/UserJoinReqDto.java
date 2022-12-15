package com.example.dashboarda.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinReqDto {

    private String username;
    private int age;
    private String psword;

    public UserJoinReqDto(UserJoinReqDto reqDto){
        this.username = reqDto.getUsername();
        this.age = reqDto.getAge();
        this.psword = reqDto.getPsword();
    }
}
