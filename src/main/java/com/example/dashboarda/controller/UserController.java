package com.example.dashboarda.controller;

import com.example.dashboarda.controller.response.Response;
import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.dto.responseDto.UserJoinResDto;
import com.example.dashboarda.model.User;
import com.example.dashboarda.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResDto> join(@RequestBody UserJoinReqDto request) {
        User user = userService.join(request);
        UserJoinResDto response = UserJoinResDto.fromUser(user);
        return Response.success(response);
    }

    @PostMapping("/joinByMapstruct")
    public Response<?> joinByMapstruct(@RequestBody UserJoinReqDto request) {
        UserJoinResDto resDto = userService.joinByMapstruct(request);
        return Response.success(resDto);
    }

    /*@PostMapping("/join")
    public Response<UserDto> join(@RequestBody UserDto request) {
        UserDto userDto = userService.join(request);
        //UserJoinResDto response = UserJoinResDto.fromUser(user);
        return Response.success(userDto);
    }*/
}
