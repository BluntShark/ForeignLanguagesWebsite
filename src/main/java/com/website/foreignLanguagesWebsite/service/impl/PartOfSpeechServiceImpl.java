package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.PartOfSpeechMapper;
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

    @Override
    public PartOfSpeechDto getPartOfSpeechById(Long partOfSpeechId) {
        return PartOfSpeechMapper.mapToPartOfSpeechDto(partOfSpeechRepository.findById(partOfSpeechId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Word is not exists with given id: " + partOfSpeechId)));
    }
}