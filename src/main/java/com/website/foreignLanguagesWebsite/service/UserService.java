package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    //List<UserDto> getAllUsersByWord(Long wordId);
}
