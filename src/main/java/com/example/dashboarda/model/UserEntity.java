package com.example.dashboarda.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "users")
public class UserEntity extends TimeStamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String psword;

}
