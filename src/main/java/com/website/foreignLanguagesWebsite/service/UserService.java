package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.UserDto;
import com.website.foreignLanguagesWebsite.entity.userentity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    //List<User> getAllUsersByWordId(Long wordId);
}
