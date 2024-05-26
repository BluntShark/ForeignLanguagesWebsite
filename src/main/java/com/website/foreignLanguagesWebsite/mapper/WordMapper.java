package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;

public class WordMapper {
    public static WordDto mapToWordDto(Word word){
        return new WordDto(
                word.getId(),
                word.getWordInRussian(),
                word.getTranscription(),
                word.getHiragana(),
                word.getKatakana(),
                word.getKanji(),
                word.getExample(),
                word.getTranslation()
        );
    }
    public static Word mapToWord(WordDto wordDto){
        return new Word(
                wordDto.getId(),
                wordDto.getWordInRussian(),
                wordDto.getTranscription(),
                wordDto.getHiragana(),
                wordDto.getKatakana(),
                wordDto.getKanji(),
                wordDto.getExample(),
                wordDto.getTranslation()
        );
    }
}
