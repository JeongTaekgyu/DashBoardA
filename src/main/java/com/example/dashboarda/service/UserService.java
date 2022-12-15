package com.example.dashboarda.service;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.dto.responseDto.UserJoinResDto;
import com.example.dashboarda.model.User;

public interface UserService {

    User join(UserJoinReqDto reqDto);
//    UserDto join(UserDto userDto);
    UserJoinResDto joinByMapstruct(UserJoinReqDto reqDto);

}
