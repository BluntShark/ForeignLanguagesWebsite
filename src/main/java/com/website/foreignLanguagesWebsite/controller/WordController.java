package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

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
        return ResponseEntity.ok(wordService.getWordById(word));
    }
    @GetMapping
    public ResponseEntity<List<WordDto>> getAllWords(){
        return ResponseEntity.ok(wordService.getAllWords());
    }
//    @PostMapping("/byUserId/{id}")
//    public ResponseEntity<List<WordDto>> getWordsByUserId(@PathVariable("id") Long id){
//        return ResponseEntity.ok(Collections.singletonList(wordService.getWordById(id)));
//    }
    @PutMapping("{id}")
    public ResponseEntity<WordDto> updateWord(@PathVariable("id") Long id,
                                                  @RequestBody WordDto wordDto){
        return ResponseEntity.ok(wordService.updateWord(id, wordDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteWord(@PathVariable("id") Long id){
        wordService.deleteWord(id);
        return ResponseEntity.ok("Word delete successfully");
    }
}

