package com.website.foreignLanguagesWebsite.controller;

import com.website.foreignLanguagesWebsite.dto.LessonCategoryDto;
import com.website.foreignLanguagesWebsite.service.LessonCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/lessonCategories")
public class LessonCategoryController {
    private LessonCategoryService lessonCategoryService;
    @PostMapping
    public ResponseEntity<LessonCategoryDto> createLessonCategory(@RequestBody LessonCategoryDto lessonCategoryDto) {
        return new ResponseEntity<>(lessonCategoryService.createLessonCategory(lessonCategoryDto), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<LessonCategoryDto> getLessonCategoryById(@PathVariable("id") Long lessonCategory){
        return ResponseEntity.ok(lessonCategoryService.getLessonCategoryById(lessonCategory));
    }
    @GetMapping
    public ResponseEntity<List<LessonCategoryDto>> getAllLessonCategories(){
        return ResponseEntity.ok(lessonCategoryService.getAllLessonCategories());
    }
}
