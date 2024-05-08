package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.LessonDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;

import java.util.List;

public interface LessonService {
    LessonDto createLesson(LessonDto lessonDto);
    LessonDto getLessonById(Long lessonId);
    List<LessonDto> getAllLessons();
}
