package com.example.dashboarda.repository;

import com.example.dashboarda.model.User;
import com.example.dashboarda.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

    Optional<User> findByUsername(String userName);
}
