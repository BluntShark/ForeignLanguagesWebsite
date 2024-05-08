package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.wordentity.JapaneseWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JapaneseWordRepository extends JpaRepository<JapaneseWord, Long> {
}
