package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/tests")
public class TestController {
    private final TestService testService;
    @PostMapping
    public ResponseEntity<TestDto> createTest(@RequestBody TestDto testDto) {
        return new ResponseEntity<>(testService.createTest(testDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<TestDto> getTestById(@PathVariable("id") Long testId) {
        return ResponseEntity.ok(testService.getTestById(testId));
    }
    @GetMapping
    public ResponseEntity<List<TestDto>> getAllTests() {
        return ResponseEntity.ok(testService.getAllTests());
    }
    @PutMapping("{id}")
    public ResponseEntity<TestDto> updateTest(@PathVariable("id") Long testId,
                                              @RequestBody TestDto testDto) {
        return ResponseEntity.ok(testService.updateTest(testId, testDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTest(@PathVariable("id") Long testId) {
        testService.deleteTest(testId);
        return ResponseEntity.ok("Test deleted successfully");
    }
}
