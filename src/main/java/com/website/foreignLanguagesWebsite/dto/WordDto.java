package com.website.foreignLanguagesWebsite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class WordDto {
    private Long id;
    private String wordInRussian;
    private String transcription;
    private String hiragana = "-";
    private String katakana = "-";
    private String kanji = "-";
    private String example = "-";
    private String translation = "-";
}
