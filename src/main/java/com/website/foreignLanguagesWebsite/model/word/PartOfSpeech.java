package com.website.foreignLanguagesWebsite.model.word;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "partofspeech")
public class PartOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "part_of_speech")
    private Long partOfSpeech;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partOfSpeech") //если удалить часть речи - удалится и слово
    private List<Word> words;
}
