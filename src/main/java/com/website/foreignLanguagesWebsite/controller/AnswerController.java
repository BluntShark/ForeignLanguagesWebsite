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
    private final AnswerService answerService;

    @PostMapping
    public ResponseEntity<AnswerDto> createAnswer(@PathVariable("questionId") Long questionId,
                                                  @RequestBody AnswerDto answerDto) {
        return new ResponseEntity<>(answerService.createAnswer(questionId, answerDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<AnswerDto> getAnswerById(@PathVariable("id") Long answerId) {
        return ResponseEntity.ok(answerService.getAnswerById(answerId));
    }

    @GetMapping("/byQuestionId/{id}")
    public ResponseEntity<List<AnswerDto>> getAllAnswersByQuestionId(@PathVariable("id") Long questionId) {
        return ResponseEntity.ok(answerService.getAllAnswersByQuestionId(questionId));
    }

    @PutMapping("{id}")
    public ResponseEntity<AnswerDto> updateAnswer(@PathVariable("id") Long answerId,
                                                  @RequestBody AnswerDto answerDto) {
        return ResponseEntity.ok(answerService.updateAnswer(answerId, answerDto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAnswer(@PathVariable("id") Long answerId) {
        answerService.deleteAnswer(answerId);
        return ResponseEntity.ok("Answer deleted successfully");
    }
}
