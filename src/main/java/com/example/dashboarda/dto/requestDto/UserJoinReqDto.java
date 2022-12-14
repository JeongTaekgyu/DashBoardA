package com.example.dashboarda.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserJoinReqDto {

    private String username;
    private String password;
}
