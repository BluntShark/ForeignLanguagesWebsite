package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.userentity.User;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {
    //List<Word> findWordsByUserId(Long userId);
}
