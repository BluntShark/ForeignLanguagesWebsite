package com.website.foreignLanguagesWebsite.entity.word;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partofspeech")
public class PartOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "part_of_speech")
    private String partOfSpeech;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partOfSpeech") //если удалить часть речи - удалится и слово
    private List<Word> words;
}
