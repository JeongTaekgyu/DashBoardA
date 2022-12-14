package com.example.dashboarda.dto.responseDto;

import com.example.dashboarda.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserJoinResDto {

    private Long id;
    private String userName;

    public static UserJoinResDto fromUser(User user){
        return new UserJoinResDto(
                user.getId(),
                user.getUsername()
        );
    }
}
