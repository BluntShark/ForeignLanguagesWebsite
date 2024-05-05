package com.website.foreignLanguagesWebsite.model.test;

import com.website.foreignLanguagesWebsite.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "answer")
    private String answer;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;
}
