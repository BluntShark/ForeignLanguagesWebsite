package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class JapaneseWordDto {
    private Long id;
    private String hiragana;
    private String katakana;
    private String kanji;
    private Word words;
}
