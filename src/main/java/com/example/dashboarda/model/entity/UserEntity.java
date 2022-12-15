package com.example.dashboarda.model.entity;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.model.TimeStamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "users")
@NoArgsConstructor
public class UserEntity extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String psword;

    public UserEntity(UserJoinReqDto reqDto){
        this.username = reqDto.getUsername();
        this.age = reqDto.getAge();
        this.psword = reqDto.getPsword();
    }

    public static UserEntity of(UserJoinReqDto reqDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(reqDto.getUsername());
        userEntity.setAge(reqDto.getAge());
        userEntity.setPsword(reqDto.getPsword());
        return userEntity;
    }
}
