package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;

public class WordMapper {
    public static WordDto mapToWordDto(Word word){
        return new WordDto(
                word.getId(),
                word.getJapaneseWord(),
                word.getWordInRussian(),
                word.getTranscription(),
                word.getPartOfSpeech()
        );
    }
    public static Word mapToWord(WordDto wordDto){
        return new Word(
                wordDto.getId(),
                wordDto.getJapaneseWord(),
                wordDto.getWordInRussian(),
                wordDto.getTranscription(),
                wordDto.getPartOfSpeech()
        );
    }
}
