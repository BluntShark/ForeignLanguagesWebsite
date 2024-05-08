package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
