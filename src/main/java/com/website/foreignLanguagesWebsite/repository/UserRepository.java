package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
