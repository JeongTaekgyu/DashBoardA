package com.example.dashboarda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    // 지금은 안쓴다.
    private String username;
    private int age;
    private String password;

}
