package com.example.dashboarda.model.entity.mapper;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.model.entity.UserEntity;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserReqMapper extends GenericMapper<UserJoinReqDto, UserEntity> {
}
