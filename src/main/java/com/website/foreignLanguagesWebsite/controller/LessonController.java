package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.dto.LessonDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.service.LessonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/lessons")
public class LessonController {
    private LessonService lessonService;
    @PostMapping
    public ResponseEntity<LessonDto> createLesson(@RequestBody LessonDto lessonDto) {
        return new ResponseEntity<>(lessonService.createLesson(lessonDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<LessonDto> getLessonById(@PathVariable("id") Long lesson){
        return ResponseEntity.ok(lessonService.getLessonById(lesson));
    }
    @GetMapping
    public ResponseEntity<List<LessonDto>> getAllLessons(){
        return ResponseEntity.ok(lessonService.getAllLessons());
    }
    @PutMapping("{id}")
    public ResponseEntity<LessonDto> updateLesson(@PathVariable("id") Long id,
                                                  @RequestBody LessonDto lessonDto){
        return ResponseEntity.ok(lessonService.updateLesson(id, lessonDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLesson(@PathVariable("id") Long id){
        lessonService.deleteLesson(id);
        return ResponseEntity.ok("Lesson delete successfully");
    }
}
