package com.example.dashboarda.model.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "post_likes")
public class PostLikesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) // ManyToOne의 default는 EAGER,
    @JoinColumn(name = "users_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;
}
