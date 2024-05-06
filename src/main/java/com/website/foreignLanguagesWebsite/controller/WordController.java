package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/words")
public class WordController {
    private WordService wordService;
    @PostMapping
    public ResponseEntity<WordDto> createWord(@RequestBody WordDto wordDto) {
        WordDto savedWord = wordService.createWord(wordDto);
        return new ResponseEntity<>(savedWord, HttpStatus.CREATED);
    }
}

