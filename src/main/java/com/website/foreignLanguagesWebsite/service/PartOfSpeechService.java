package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;

import java.util.List;

public interface PartOfSpeechService {
    PartOfSpeechDto createPartOfSpeech(PartOfSpeechDto partOfSpeechDto);
    PartOfSpeechDto getPartOfSpeechById(Long partOfSpeechId);
    List<PartOfSpeechDto> getAllPartOfSpeeches();
}
