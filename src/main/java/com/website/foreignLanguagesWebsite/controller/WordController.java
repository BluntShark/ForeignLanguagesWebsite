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
        return new ResponseEntity<>(wordService.createWord(wordDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<WordDto> getWordById(@PathVariable("id") Long word){
        return ResponseEntity.ok(wordService.getWordDtoById(word));
    }
}

