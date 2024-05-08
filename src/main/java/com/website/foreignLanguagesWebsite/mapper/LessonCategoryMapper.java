package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.LessonCategoryDto;
import com.website.foreignLanguagesWebsite.entity.lessonentity.LessonCategory;

public class LessonCategoryMapper {
    public static LessonCategoryDto mapToLessonCategoryDto(LessonCategory lessonCategory){
        return new LessonCategoryDto(
                lessonCategory.getId(),
                lessonCategory.getTitle(),
                lessonCategory.getDescription(),
                lessonCategory.getLessons()
        );
    }
    public static LessonCategory mapToLessonCategory(LessonCategoryDto lessonCategoryDto){
        return new LessonCategory(
                lessonCategoryDto.getId(),
                lessonCategoryDto.getTitle(),
                lessonCategoryDto.getDescription(),
                lessonCategoryDto.getLessons()
        );
    }
}
