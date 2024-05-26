package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.QuestionDto;
import com.website.foreignLanguagesWebsite.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<QuestionDto> createQuestion(@PathVariable("testId") Long testId,
                                                      @RequestBody QuestionDto questionDto) {
        return new ResponseEntity<>(questionService.createQuestion(testId, questionDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<QuestionDto> getQuestionById(@PathVariable("id") Long questionId) {
        return ResponseEntity.ok(questionService.getQuestionById(questionId));
    }

    @GetMapping
    public ResponseEntity<List<QuestionDto>> getAllQuestionsByTestId(@PathVariable("testId") Long testId) {
        return ResponseEntity.ok(questionService.getAllQuestionsByTestId(testId));
    }

    @PutMapping("{id}")
    public ResponseEntity<QuestionDto> updateQuestion(@PathVariable("id") Long questionId,
                                                      @RequestBody QuestionDto questionDto) {
        return ResponseEntity.ok(questionService.updateQuestion(questionId, questionDto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable("id") Long questionId) {
        questionService.deleteQuestion(questionId);
        return ResponseEntity.ok("Question deleted successfully");
    }
}
