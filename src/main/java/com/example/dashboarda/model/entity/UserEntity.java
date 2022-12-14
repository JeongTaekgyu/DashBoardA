package com.example.dashboarda.model.entity;

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
    private String psword;

    public static UserEntity of(String userName, String password){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userName);
        userEntity.setPsword(password);
        return userEntity;
    }
}
