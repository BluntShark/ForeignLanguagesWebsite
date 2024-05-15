package com.website.foreignLanguagesWebsite.entity.wordentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.reference.PartOfSpeech;
import com.website.foreignLanguagesWebsite.entity.userentity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "word_in_russian", nullable = false)
    private String wordInRussian;
    @Column(name = "transcription", nullable = false)
    private String transcription;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "part_of_speech_id", nullable = false)
    private PartOfSpeech partOfSpeech;
    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore
    @JoinColumn(name = "word_in_japanese_id", nullable = false)
    private JapaneseWord japaneseWord;
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "userword",
            joinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private Set<User> users = new HashSet<>();

    public Word(Long id, JapaneseWord japaneseWord, String wordInRussian, String transcription, PartOfSpeech partOfSpeech) {
        this.id = id;
        this.japaneseWord = japaneseWord;
        this.wordInRussian = wordInRussian;
        this.transcription = transcription;
        this.partOfSpeech = partOfSpeech;
    }
}
