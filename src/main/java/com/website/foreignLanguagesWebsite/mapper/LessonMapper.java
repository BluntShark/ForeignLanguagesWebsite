package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.LessonDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;

public class LessonMapper {
    public static LessonDto mapToLessonDto(Lesson lesson){
        return new LessonDto(
                lesson.getId(),
                lesson.getTitle(),
                lesson.getDescription(),
                lesson.getContent(),
                lesson.getDateOfCreation(),
                lesson.getDuration(),
                lesson.getDifficultlyLevel(),
                lesson.getLessonCategory()
        );
    }
    public static Lesson mapToLesson(LessonDto lessonDto){
        return new Lesson(
                lessonDto.getId(),
                lessonDto.getTitle(),
                lessonDto.getDescription(),
                lessonDto.getContent(),
                lessonDto.getDateOfCreation(),
                lessonDto.getDuration(),
                lessonDto.getDifficultlyLevel(),
                lessonDto.getLessonCategory()
        );
    }
}
