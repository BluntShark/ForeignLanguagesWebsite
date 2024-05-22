package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.LessonDto;
import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;

public class LessonMapper {
    public static LessonDto mapToLessonDto(Lesson lesson){
        return new LessonDto(
                lesson.getId(),
                lesson.getTitle(),
                lesson.getContent(),
                lesson.getDuration(),
                lesson.getDifficultlyLevel(),
                lesson.getLessonCategory()
        );
    }
    public static Lesson mapToLesson(LessonDto lessonDto){
        return new Lesson(
                lessonDto.getId(),
                lessonDto.getTitle(),
                lessonDto.getContent(),
                lessonDto.getDuration(),
                lessonDto.getDifficultlyLevel(),
                lessonDto.getLessonCategory()
        );
    }
}
