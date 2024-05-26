package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.userentity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
