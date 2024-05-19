package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/answers")
public class AnswerController {
    private AnswerService answerService;
    @PostMapping
    public ResponseEntity<AnswerDto> createAnswer(@RequestBody AnswerDto answerDto) {
        return new ResponseEntity<>(answerService.createAnswer(answerDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<AnswerDto> getAnswerById(@PathVariable("id") Long answer){
        return ResponseEntity.ok(answerService.getAnswerById(answer));
    }
    @GetMapping
    public ResponseEntity<List<AnswerDto>> getAllAnswers(){
        return ResponseEntity.ok(answerService.getAllAnswers());
    }
    @PutMapping("{id}")
    public ResponseEntity<AnswerDto> updateAnswer(@PathVariable("id") Long id,
                                                  @RequestBody AnswerDto answerDto){
        return ResponseEntity.ok(answerService.updateAnswer(id, answerDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAnswer(@PathVariable("id") Long id){
        answerService.deleteAnswer(id);
        return ResponseEntity.ok("Answer delete successfully");
    }
}
