package com.example.dashboarda.model.entity;

import com.example.dashboarda.model.TimeStamped;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "\"comment\"")
public class CommentEntity extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comments", nullable = false)
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;

}
