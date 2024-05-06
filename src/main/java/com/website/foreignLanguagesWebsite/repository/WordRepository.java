package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.word.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
