package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;
import com.website.foreignLanguagesWebsite.entity.word.PartOfSpeech;
import com.website.foreignLanguagesWebsite.entity.word.Word;
import com.website.foreignLanguagesWebsite.mapper.PartOfSpeechMapper;
import com.website.foreignLanguagesWebsite.mapper.WordMapper;
import com.website.foreignLanguagesWebsite.repository.PartOfSpeechRepository;
import com.website.foreignLanguagesWebsite.service.PartOfSpeechService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartOfSpeechServiceImpl implements PartOfSpeechService {
    private PartOfSpeechRepository partOfSpeechRepository;
    @Override
    public PartOfSpeechDto createPartOfSpeech(PartOfSpeechDto partOfSpeechDto) {
        return PartOfSpeechMapper
                .mapToPartOfSpeechDto(partOfSpeechRepository
                .save(PartOfSpeechMapper
                .mapToPartOfSpeech(partOfSpeechDto)));
    }
}
