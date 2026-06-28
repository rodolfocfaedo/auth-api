package com.rodolfodev.authapi.mapper;

import com.rodolfodev.authapi.domain.User;
import com.rodolfodev.authapi.dto.UserRequestDTO;
import com.rodolfodev.authapi.dto.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    User toUserEntity (UserRequestDTO userRequestDTO);

    UserResponseDTO toUserResponseDTO(User user);
}
