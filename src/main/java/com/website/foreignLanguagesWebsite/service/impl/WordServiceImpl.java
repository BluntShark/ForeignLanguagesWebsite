package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.WordMapper;
import com.website.foreignLanguagesWebsite.repository.WordRepository;
import com.website.foreignLanguagesWebsite.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public WordDto getWordById(Long wordId) {
        return WordMapper.mapToWordDto(wordRepository.findById(wordId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Part of speech is not exists with given id: " + wordId)));
    }

    @Override
    public List<WordDto> getAllWords() {
        return wordRepository.findAll().stream().map((word) -> WordMapper.mapToWordDto(word)).collect(Collectors.toList());
    }

    @Override
    public WordDto updateWord(Long wordId, WordDto wordDto) {
        Word word = wordRepository.findById(wordId).orElseThrow(() ->
                new ResourceNotFoundException("Word is not exists with given id: " + wordId));

        word.setWordInRussian(wordDto.getWordInRussian());
        word.setTranscription(wordDto.getTranscription());
        word.setPartOfSpeech(wordDto.getPartOfSpeech());
        word.setJapaneseWord(wordDto.getJapaneseWord());

        return WordMapper.mapToWordDto(wordRepository.save(word));
    }

    @Override
    public void deleteWord(Long wordId) {
        wordRepository.findById(wordId).orElseThrow(() ->
                new ResourceNotFoundException("Word is not exists with given id: " + wordId));
        wordRepository.deleteById(wordId);
    }
}
