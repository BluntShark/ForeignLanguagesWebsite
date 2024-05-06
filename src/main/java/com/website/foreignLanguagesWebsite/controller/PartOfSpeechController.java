package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;
import com.website.foreignLanguagesWebsite.service.PartOfSpeechService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/partOfSpeech")
public class PartOfSpeechController {
    private PartOfSpeechService partOfSpeechService;
    @PostMapping
    public ResponseEntity<PartOfSpeechDto> createPartOfSpeech(@RequestBody PartOfSpeechDto partOfSpeechDto) {
        return new ResponseEntity<>(partOfSpeechService.createPartOfSpeech(partOfSpeechDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<PartOfSpeechDto> getPartOfSpeechById(@PathVariable("id") Long partOfSpeech){
        return ResponseEntity.ok(partOfSpeechService.getPartOfSpeechById(partOfSpeech));
    }
}
