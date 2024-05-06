package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.WordMapper;
import com.website.foreignLanguagesWebsite.repository.WordRepository;
import com.website.foreignLanguagesWebsite.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WordServiceImpl implements WordService {
    private WordRepository wordRepository;
    @Override
    public WordDto createWord(WordDto wordDto) {
        return WordMapper
                .mapToWordDto(wordRepository
                .save(WordMapper
                .mapToWord(wordDto)));
    }

    @Override
    public WordDto getWordDtoById(Long wordId) {
        return WordMapper.mapToWordDto(wordRepository.findById(wordId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Part of speech is not exists with given id: " + wordRepository)));
    }
}
