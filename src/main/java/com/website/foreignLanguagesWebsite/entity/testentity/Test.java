package com.website.foreignLanguagesWebsite.entity.testentity;

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
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "question", nullable = false)
    private String question;
    @OneToMany(mappedBy = "test")
    @JsonIgnore
    private List<Answer> answers;
    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "correct_answer_id")
    private Answer correctAnswer;
    @OneToOne(mappedBy = "test")
    private Lesson lesson;
//    @Column(name = "is_completed")
//    private Boolean isCompleted;
}
