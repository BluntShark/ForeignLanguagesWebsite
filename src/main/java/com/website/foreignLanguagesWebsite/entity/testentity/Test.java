package com.website.foreignLanguagesWebsite.entity.testentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.reference.LanguageLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "language_level_id")
    private LanguageLevel languageLevel;
    @JsonIgnore
    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questions;
}
