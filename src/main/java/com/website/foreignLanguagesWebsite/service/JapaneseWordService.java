package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.JapaneseWordDto;

import java.util.List;

public interface JapaneseWordService {
    JapaneseWordDto createJapaneseWord(JapaneseWordDto japaneseWordDto);
    JapaneseWordDto getJapaneseWordById(Long wordId);
    List<JapaneseWordDto> getAllJapaneseWords();
    JapaneseWordDto updateJapaneseWord(Long wordId, JapaneseWordDto japaneseWordDto);
    void deleteJapaneseWord(Long wordId);
}
