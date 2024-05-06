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
        PartOfSpeechDto savedPartOfSpeechDto = partOfSpeechService.createPartOfSpeech(partOfSpeechDto);
        return new ResponseEntity<>(savedPartOfSpeechDto, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<PartOfSpeechDto> getPartOfSpeechById(@PathVariable("id") Long partOfSpeech){
        PartOfSpeechDto partOfSpeechDto = partOfSpeechService.getPartOfSpeechById(partOfSpeech);
        return ResponseEntity.ok(partOfSpeechDto);
    }
}
