package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.UserDto;
import com.website.foreignLanguagesWebsite.entity.userentity.User;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.UserMapper;
import com.website.foreignLanguagesWebsite.repository.UserRepository;
import com.website.foreignLanguagesWebsite.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
        return UserMapper
                .mapToUserDto(userRepository
                        .save(UserMapper
                                .mapToUser(userDto)));
    }

    @Override
    public UserDto getUserById(Long userId) {
        return UserMapper.mapToUserDto(userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exists with given id: " + userId)));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map((user) -> UserMapper.mapToUserDto(user)).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto userDto) {
        User user = userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("User is not exists with given id: " + userId));

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setLanguageLevel(userDto.getLanguageLevel());

        return UserMapper.mapToUserDto(userRepository.save(user));
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("User is not exists with given id: " + userId));
        userRepository.deleteById(userId);
    }
}
