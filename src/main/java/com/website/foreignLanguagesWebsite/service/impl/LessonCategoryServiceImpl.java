package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.LessonCategoryDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.LessonCategoryMapper;
import com.website.foreignLanguagesWebsite.repository.LessonCategoryRepository;
import com.website.foreignLanguagesWebsite.service.LessonCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LessonCategoryServiceImpl implements LessonCategoryService {
    private LessonCategoryRepository lessonCategoryRepository;
    @Override
    public LessonCategoryDto createLessonCategory(LessonCategoryDto lessonCategoryDto) {
        return LessonCategoryMapper
                .mapToLessonCategoryDto(lessonCategoryRepository
                        .save(LessonCategoryMapper
                                .mapToLessonCategory(lessonCategoryDto)));
    }

    @Override
    public LessonCategoryDto getLessonCategoryById(Long lessonCategoryId) {
        return LessonCategoryMapper.mapToLessonCategoryDto(lessonCategoryRepository.findById(lessonCategoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Language level is not exists with given id: " + lessonCategoryId)));
    }

    @Override
    public List<LessonCategoryDto> getAllLessonCategories() {
        return lessonCategoryRepository.findAll().stream().map((lesson) -> LessonCategoryMapper.mapToLessonCategoryDto(lesson)).collect(Collectors.toList());
    }
}
