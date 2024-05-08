package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.UserDto;
import com.website.foreignLanguagesWebsite.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long user) {
        return ResponseEntity.ok(userService.getUserById(user));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //    @GetMapping("/byWordId/{id}")
//    public  ResponseEntity<List<User>> getUserByWordId(@PathVariable("id") Long wordId){
//        return ResponseEntity.ok(userRepository.findUsersByWordId(wordId));
//    }
//    @GetMapping("/getByWord")
//    public List<User> getByUser(@RequestBody Word word){
//        return userServiceImpl.getByWord(word);
//    }
}
