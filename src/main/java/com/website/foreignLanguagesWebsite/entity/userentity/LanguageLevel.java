package com.website.foreignLanguagesWebsite.entity.userentity;

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
    @Column(name = "description", nullable=false)
    private String description;
    @OneToMany(mappedBy = "languageLevel")
    private List<User> users;
}