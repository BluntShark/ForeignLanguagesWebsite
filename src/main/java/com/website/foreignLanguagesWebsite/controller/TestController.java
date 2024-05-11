package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/tests")
public class TestController {
    private TestService testService;
    @PostMapping
    public ResponseEntity<TestDto> createTest(@RequestBody TestDto testDto) {
        return new ResponseEntity<>(testService.createTest(testDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TestDto> getTestById(@PathVariable("id") Long test) {
        return ResponseEntity.ok(testService.getTestById(test));
    }

    @GetMapping
    public ResponseEntity<List<TestDto>> getAllTests() {
        return ResponseEntity.ok(testService.getAllTests());
    }
    @PutMapping("{id}")
    public ResponseEntity<TestDto> updateTest(@PathVariable("id") Long id,
                                                  @RequestBody TestDto testDto){
        return ResponseEntity.ok(testService.updateTest(id, testDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTest(@PathVariable("id") Long id){
        testService.deleteTest(id);
        return ResponseEntity.ok("Test delete successfully");
    }
}
