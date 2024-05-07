package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.userentity.User;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //List<User> findUsersByWord(Word word);
}
