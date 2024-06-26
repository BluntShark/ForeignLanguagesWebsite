package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
}
