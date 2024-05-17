package com.website.foreignLanguagesWebsite.entity.reference;

import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lessoncategory")
public class LessonCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "lessonCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lesson> lessons;
}
