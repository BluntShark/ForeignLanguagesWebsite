package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.JapaneseWordDto;
import com.website.foreignLanguagesWebsite.service.JapaneseWordService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/japaneseWords")
public class JapaneseWordController {
    private JapaneseWordService japaneseWordService;
    @PostMapping
    public ResponseEntity<JapaneseWordDto> createJapaneseWord(@RequestBody JapaneseWordDto japaneseWordDto) {
        return new ResponseEntity<>(japaneseWordService.createJapaneseWord(japaneseWordDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<JapaneseWordDto> getJapaneseWordById(@PathVariable("id") Long word){
        return ResponseEntity.ok(japaneseWordService.getJapaneseWordById(word));
    }
    @GetMapping
    public ResponseEntity<List<JapaneseWordDto>> getAllJapaneseWords(){
        return ResponseEntity.ok(japaneseWordService.getAllJapaneseWords());
    }
    @PutMapping("{id}")
    public ResponseEntity<JapaneseWordDto> updateJapaneseWord(@PathVariable("id") Long id,
                                                  @RequestBody JapaneseWordDto japaneseWordDto){
        return ResponseEntity.ok(japaneseWordService.updateJapaneseWord(id, japaneseWordDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJapaneseWord(@PathVariable("id") Long id){
        japaneseWordService.deleteJapaneseWord(id);
        return ResponseEntity.ok("Japanese word delete successfully");
    }
}
