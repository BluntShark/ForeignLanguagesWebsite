package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.dto.UserDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {
//    @Transactional
//    @Query("SELECT t FROM userword where t.user_id = ?1")
    List<WordDto> findByUsers(UserDto userDto);
}
