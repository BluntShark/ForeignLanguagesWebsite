package com.website.foreignLanguagesWebsite.entity.test;

import com.website.foreignLanguagesWebsite.entity.lesson.Lesson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "question")
    private String question;
    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Answer> answers;
    @OneToOne
    @JoinColumn(name = "correct_answer_id")
    private Answer correctAnswer;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "test")
    private Lesson lesson;
}
