package com.example.dashboarda.model.entity.mapper;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.model.entity.UserEntity;
import org.mapstruct.Mapper;

// @Mapper : MapStruct Code Generator가 해당 인터페이스의 구현체를 생성해준다.
// componentModel = "spring" : spring에 맞게 bean으로 등록해준다
@Mapper(componentModel = "spring")
public interface UserReqMapper extends GenericMapper<UserJoinReqDto, UserEntity> {
}
