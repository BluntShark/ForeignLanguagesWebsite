package com.website.foreignLanguagesWebsite.model.test;

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
    @OneToOne(optional = true)
    @JoinColumn(name = "correct_answer_id")
    private Answer correctAnswer;
}
