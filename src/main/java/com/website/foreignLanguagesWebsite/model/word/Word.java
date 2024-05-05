package com.website.foreignLanguagesWebsite.model.word;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "word_in_japanese")
    private String wordInJapanese;
    @Column(name = "word_in_russian")
    private String wordInRussian;
    @Column(name = "transcription")
    private String transcription;
    //id_partOfSpeech;
}
