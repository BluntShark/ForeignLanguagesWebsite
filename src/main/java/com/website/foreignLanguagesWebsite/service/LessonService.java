package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.LessonDto;

import java.util.List;

public interface LessonService {
    LessonDto createLesson(LessonDto lessonDto);
    LessonDto getLessonById(Long lessonId);
    List<LessonDto> getAllLessons();
    LessonDto updateLesson(Long lessonId, LessonDto lessonDto);
    void deleteLesson(Long lessonId);
}
