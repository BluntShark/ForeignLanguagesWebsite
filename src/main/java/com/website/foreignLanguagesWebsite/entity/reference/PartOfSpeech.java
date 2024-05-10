package com.website.foreignLanguagesWebsite.entity.reference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
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
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "partOfSpeech")
    @JsonIgnore
    private List<Word> words;
    public PartOfSpeech(Long id, String partOfSpeech) {
        this.id = id;
        this.partOfSpeech = partOfSpeech;
    }
}
