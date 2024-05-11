package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.LanguageLevelDto;
import com.website.foreignLanguagesWebsite.service.LanguageLevelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/languageLevels")
public class LanguageLevelController {
    private LanguageLevelService languageLevelService;
    @PostMapping
    public ResponseEntity<LanguageLevelDto> createLanguageLevel(@RequestBody LanguageLevelDto languageLevelDto) {
        return new ResponseEntity<>(languageLevelService.createLanguageLevel(languageLevelDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<LanguageLevelDto> getLanguageLevelById(@PathVariable("id") Long languageLevel){
        return ResponseEntity.ok(languageLevelService.getLanguageLevelById(languageLevel));
    }
    @GetMapping
    public ResponseEntity<List<LanguageLevelDto>> getAllLanguageLevels(){
        return ResponseEntity.ok(languageLevelService.getAllLanguageLevels());
    }
}
