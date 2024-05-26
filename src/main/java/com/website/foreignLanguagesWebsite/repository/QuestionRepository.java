package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.testentity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByTestId(Long testId);
}
