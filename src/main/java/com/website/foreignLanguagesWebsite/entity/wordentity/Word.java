package com.website.foreignLanguagesWebsite.entity.wordentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.userentity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
    @Column(name = "word_in_russian")
    private String wordInRussian;
    @Column(name = "transcription")
    private String transcription;
    @Column(name = "hiragana", columnDefinition = "TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci")
    private String hiragana = "-";
    @Column(name = "katakana", columnDefinition = "TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci")
    private String katakana = "-";
    @Column(name = "kanji", columnDefinition = "TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci")
    private String kanji = "-";
    @Column(name = "example", columnDefinition = "TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci")
    private String example= "-";
    @Column(name = "translation")
    private String translation= "-";

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    @JoinTable(name = "userword",
            joinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<User> users = new ArrayList<>();

    public Word(Long id, String wordInRussian, String transcription, String hiragana, String katakana, String kanji, String example, String translation) {
        this.id = id;
        this.wordInRussian = wordInRussian;
        this.transcription = transcription;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.kanji = kanji;
        this.example = example;
        this.translation = translation;
    }
}
