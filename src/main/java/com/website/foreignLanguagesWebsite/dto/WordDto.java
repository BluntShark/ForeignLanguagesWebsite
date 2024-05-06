package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.user.User;
import com.website.foreignLanguagesWebsite.entity.word.PartOfSpeech;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
