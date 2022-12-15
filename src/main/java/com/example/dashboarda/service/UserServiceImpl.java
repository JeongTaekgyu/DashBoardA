package com.example.dashboarda.service;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.dto.responseDto.UserJoinResDto;
import com.example.dashboarda.exception.DashApplicationException;
import com.example.dashboarda.exception.ErrorCode;
import com.example.dashboarda.model.User;
import com.example.dashboarda.model.entity.UserEntity;
import com.example.dashboarda.model.entity.mapper.UserReqMapper;
import com.example.dashboarda.model.entity.mapper.UserResMapper;
import com.example.dashboarda.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserEntityRepository userEntityRepository;

    private final UserReqMapper userReqMapper;
    private final UserResMapper userResMapper;

//    private final BCryptPasswordEncoder encoder;

    @Transactional
    public User join(UserJoinReqDto reqDto) {
        userEntityRepository.findByUsername(reqDto.getUsername()).ifPresent(it -> {
            throw new DashApplicationException(ErrorCode.DUPLICATED_USER_NAME, String.format("%s is duplicated", reqDto.getUsername()));
        });

        UserEntity userEntity = userEntityRepository.save(UserEntity.of(reqDto));

        return User.fromEntity(userEntity);
    }

    @Transactional
    public UserJoinResDto joinByMapstruct(UserJoinReqDto reqDto){
        userEntityRepository.findByUsername(reqDto.getUsername()).ifPresent(it -> {
            throw new DashApplicationException(ErrorCode.DUPLICATED_USER_NAME, String.format("%s is duplicated", reqDto.getUsername()));
        });

        UserEntity user = userEntityRepository.save(userReqMapper.toEntity(reqDto));
        return userResMapper.toDto(user);
    }

    /*@Transactional
    public UserDto join(UserDto reqDto) {
        userEntityRepository.findByUsername(reqDto.getUsername()).ifPresent(it -> {
            throw new DashApplicationException(ErrorCode.DUPLICATED_USER_NAME, String.format("%s is duplicated", reqDto.getUsername()));
        });
        UserEntity user = userEntityRepository.save(userMapper.toEntity(reqDto));
        return userMapper.toDto(user);
//        return userMapper.toDto(userEntityRepository.save(userMapper.toEntity(reqDto)));
    }*/
}
