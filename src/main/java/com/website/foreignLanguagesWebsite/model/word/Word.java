package com.website.foreignLanguagesWebsite.model.word;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Word {
    private Long id;
    private String wordInEnglish;
    private String wordInJapanese;
    private String wordInRussian;
    private String transcription;
    //id_partOfSpeech;
}
