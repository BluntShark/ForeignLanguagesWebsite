package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.DifficultlyLevelDto;
import com.website.foreignLanguagesWebsite.service.DifficultlyLevelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/difficultlyLevels")
public class DifficultlyLevelController {
    private DifficultlyLevelService difficultlyLevelService;
    @PostMapping
    public ResponseEntity<DifficultlyLevelDto> createDifficultlyLevel(@RequestBody DifficultlyLevelDto difficultlyLevelDto) {
        return new ResponseEntity<>(difficultlyLevelService.createDifficultlyLevel(difficultlyLevelDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<DifficultlyLevelDto> getDifficultlyLevelById(@PathVariable("id") Long level){
        return ResponseEntity.ok(difficultlyLevelService.getDifficultlyLevelById(level));
    }
    @GetMapping
    public ResponseEntity<List<DifficultlyLevelDto>> getAllDifficultlyLevels(){
        return ResponseEntity.ok(difficultlyLevelService.getAllDifficultlyLevels());
    }
}
