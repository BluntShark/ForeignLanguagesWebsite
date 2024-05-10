package com.website.foreignLanguagesWebsite.entity.reference;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "difficultlylevel")
public class DifficultlyLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "level")
    private String level;
    @OneToMany(mappedBy = "difficultlyLevel")
    @JsonIgnore
    private List<Lesson> lessons;
}
