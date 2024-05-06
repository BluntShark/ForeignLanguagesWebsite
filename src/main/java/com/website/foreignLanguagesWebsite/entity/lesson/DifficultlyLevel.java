package com.website.foreignLanguagesWebsite.entity.lesson;

import com.website.foreignLanguagesWebsite.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
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
    private List<Lesson> lessons;
}
