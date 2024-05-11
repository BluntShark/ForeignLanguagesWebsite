package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.LessonCategoryDto;

import java.util.List;

public interface LessonCategoryService {
    LessonCategoryDto createLessonCategory(LessonCategoryDto lessonCategoryDto);
    LessonCategoryDto getLessonCategoryById(Long lessonCategoryId);
    List<LessonCategoryDto> getAllLessonCategories();
}
