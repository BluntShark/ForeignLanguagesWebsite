package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.wordentity.PartOfSpeech;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class WordDto {
    private Long id;
    private String wordInJapanese;
    private String wordInRussian;
    private String transcription;
    private PartOfSpeech partOfSpeech;
}
