package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.service.PartOfSpeechService;
import com.website.foreignLanguagesWebsite.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/partOfSpeech")
public class PartOfSpeechController {
    private PartOfSpeechService partOfSpeechService;
    @PostMapping
    public ResponseEntity<PartOfSpeechDto> createPartOfSpeechDto(@RequestBody PartOfSpeechDto partOfSpeechDto) {
        PartOfSpeechDto savedPartOfSpeechDto = partOfSpeechService.createPartOfSpeech(partOfSpeechDto);
        return new ResponseEntity<>(savedPartOfSpeechDto, HttpStatus.CREATED);
    }
}
