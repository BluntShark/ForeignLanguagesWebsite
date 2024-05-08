package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.JapaneseWordDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;

import java.util.List;

public interface JapaneseWordService {
    JapaneseWordDto createJapaneseWord(JapaneseWordDto japaneseWordDto);
    JapaneseWordDto getJapaneseWordById(Long wordId);
    List<JapaneseWordDto> getAllJapaneseWords();
}
