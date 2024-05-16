package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.WordDto;

import java.util.List;

public interface WordService {
    WordDto createWord(WordDto wordDto);
    WordDto getWordById(Long wordId);
    List<WordDto> getAllWords();
    WordDto updateWord(Long wordId, WordDto wordDto);
    void deleteWord(Long wordId);

}
