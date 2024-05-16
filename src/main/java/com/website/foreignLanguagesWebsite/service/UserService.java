package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.UserDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto userDto);
    void deleteUser(Long userId);
    UserDto addWord(WordDto wordDto);
    List<UserDto> getAllWords();
}
