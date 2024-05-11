package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.LessonDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.LessonMapper;
import com.website.foreignLanguagesWebsite.repository.LessonRepository;
import com.website.foreignLanguagesWebsite.service.LessonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LessonServiceImpl implements LessonService {
    private LessonRepository lessonRepository;
    @Override
    public LessonDto createLesson(LessonDto lessonDto) {
        return LessonMapper
                .mapToLessonDto(lessonRepository
                        .save(LessonMapper
                                .mapToLesson(lessonDto)));
    }

    @Override
    public LessonDto getLessonById(Long lessonId) {
        return LessonMapper.mapToLessonDto(lessonRepository.findById(lessonId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Lesson is not exists with given id: " + lessonId)));
    }

    @Override
    public List<LessonDto> getAllLessons() {
        return lessonRepository.findAll().stream().map((lesson) -> LessonMapper.mapToLessonDto(lesson)).collect(Collectors.toList());
    }
}