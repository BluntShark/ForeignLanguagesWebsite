package com.website.foreignLanguagesWebsite.entity.reference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import com.website.foreignLanguagesWebsite.entity.userentity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "languagelevel")
public class LanguageLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable=false)
    private String title;
    @OneToMany(mappedBy = "languageLevel")
    @JsonIgnore
    private List<User> users;
    @OneToMany(mappedBy = "languageLevel")
    @JsonIgnore
    private List<Test> tests;
}
