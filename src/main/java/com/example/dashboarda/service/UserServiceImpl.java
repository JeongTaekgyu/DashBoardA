package com.example.dashboarda.service;

import com.example.dashboarda.exception.DashApplicationException;
import com.example.dashboarda.exception.ErrorCode;
import com.example.dashboarda.model.User;
import com.example.dashboarda.model.entity.UserEntity;
import com.example.dashboarda.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    //
    private final UserEntityRepository userEntityRepository;

//    private final BCryptPasswordEncoder encoder;

    @Transactional
    public User join(String userName, String password) {
        userEntityRepository.findByUsername(userName).ifPresent(it -> {
            throw new DashApplicationException(ErrorCode.DUPLICATED_USER_NAME, String.format("%s is duplicated", userName));
        });

//        UserEntity userEntity = userEntityRepository.save(UserEntity.of(userName, encoder.encode(password)));
        UserEntity userEntity = userEntityRepository.save(UserEntity.of(userName, password));

        return User.fromEntity(userEntity);
    }
}
