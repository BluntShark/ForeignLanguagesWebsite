package com.website.foreignLanguagesWebsite.entity.wordentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "word_in_japanese", columnDefinition = "TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci")
    private String wordInJapanese;
    @Column(name = "word_in_russian")
    private String wordInRussian;
    @Column(name = "transcription")
    private String transcription;
    @ManyToOne
    @JoinColumn(name = "part_of_speech_id")
    private PartOfSpeech partOfSpeech;
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "userword",
            joinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private Set<User> users = new HashSet<>();

    public Word(Long id, String wordInJapanese, String wordInRussian, String transcription, PartOfSpeech partOfSpeech) {
        this.wordInJapanese = wordInJapanese;
        this.wordInRussian = wordInRussian;
        this.transcription = transcription;
        this.partOfSpeech = partOfSpeech;
    }
}
