package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;

public interface PartOfSpeechService {
    PartOfSpeechDto createPartOfSpeech(PartOfSpeechDto partOfSpeechDto);
    PartOfSpeechDto getPartOfSpeechById(Long partOfSpeechId);
}
