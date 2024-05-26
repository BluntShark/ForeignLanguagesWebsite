package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
