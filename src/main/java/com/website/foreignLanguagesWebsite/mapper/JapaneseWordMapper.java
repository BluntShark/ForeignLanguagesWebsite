package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.JapaneseWordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.JapaneseWord;

public class JapaneseWordMapper {
    public static JapaneseWordDto mapToJapaneseWordDto(JapaneseWord japaneseWord){
        return new JapaneseWordDto(
                japaneseWord.getId(),
                japaneseWord.getHiragana(),
                japaneseWord.getKatakana(),
                japaneseWord.getKanji(),
                japaneseWord.getWords()
        );
    }
    public static JapaneseWord mapToJapaneseWord(JapaneseWordDto japaneseWordDto){
        return new JapaneseWord(
                japaneseWordDto.getId(),
                japaneseWordDto.getHiragana(),
                japaneseWordDto.getKatakana(),
                japaneseWordDto.getKanji(),
                japaneseWordDto.getWords()
        );
    }
}
