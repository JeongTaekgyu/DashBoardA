package com.example.dashboarda.model.entity.mapper;

import com.example.dashboarda.dto.responseDto.UserJoinResDto;
import com.example.dashboarda.model.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserResMapper extends GenericMapper<UserJoinResDto, UserEntity> {
}
