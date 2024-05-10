package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.wordentity.JapaneseWord;
import com.website.foreignLanguagesWebsite.entity.reference.PartOfSpeech;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class WordDto {
    private Long id;
    private JapaneseWord japaneseWord;
    private String wordInRussian;
    private String transcription;
    private PartOfSpeech partOfSpeech;
}
