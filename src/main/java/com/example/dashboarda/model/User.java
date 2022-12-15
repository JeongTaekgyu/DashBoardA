package com.example.dashboarda.model;

import com.example.dashboarda.model.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User{

    private Long id;
    private String username;
    private int age;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static User fromEntity(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getUsername(),
                entity.getAge(),
                entity.getPsword(),
                entity.getCreatedAt(),
                entity.getModifiedAt()
        );
    }
}
