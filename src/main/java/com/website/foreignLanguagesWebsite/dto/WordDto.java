package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.user.User;
import com.website.foreignLanguagesWebsite.entity.word.PartOfSpeech;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordDto {
    private Long id;
    private String wordInJapanese;
    private String wordInRussian;
    private String transcription;
    private PartOfSpeech partOfSpeech;
    private Set<User> users = new HashSet<>();
}
