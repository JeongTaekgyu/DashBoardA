package com.example.dashboarda.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "post")
public class PostEntity extends TimeStamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private UserEntity user;
}
