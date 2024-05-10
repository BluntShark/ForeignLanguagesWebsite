package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.reference.LessonCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonCategoryRepository extends JpaRepository<LessonCategory, Long> {
}
