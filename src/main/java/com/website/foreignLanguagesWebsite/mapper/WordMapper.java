package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.word.Word;

public class WordMapper {
    public static WordDto mapToWordDto(Word word){
        return new WordDto(
                word.getId(),
                word.getWordInJapanese(),
                word.getWordInRussian(),
                word.getTranscription(),
                word.getPartOfSpeech(),
                word.getUsers()
        );
    }
    public static Word mapToWord(WordDto wordDto){
        return new Word(
                wordDto.getId(),
                wordDto.getWordInJapanese(),
                wordDto.getWordInRussian(),
                wordDto.getTranscription(),
                wordDto.getPartOfSpeech(),
                wordDto.getUsers()
        );
    }
}
