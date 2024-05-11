package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.JapaneseWordDto;
import com.website.foreignLanguagesWebsite.entity.wordentity.JapaneseWord;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.JapaneseWordMapper;
import com.website.foreignLanguagesWebsite.repository.JapaneseWordRepository;
import com.website.foreignLanguagesWebsite.service.JapaneseWordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JapaneseWordServiceImpl implements JapaneseWordService {
    private JapaneseWordRepository japaneseWordRepository;
    @Override
    public JapaneseWordDto createJapaneseWord(JapaneseWordDto japaneseWordDto) {
        return JapaneseWordMapper
                .mapToJapaneseWordDto(japaneseWordRepository
                        .save(JapaneseWordMapper
                                .mapToJapaneseWord(japaneseWordDto)));
    }

    @Override
    public JapaneseWordDto getJapaneseWordById(Long wordId) {
        return JapaneseWordMapper.mapToJapaneseWordDto(japaneseWordRepository.findById(wordId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Japanese word of speech is not exists with given id: " + wordId)));
    }

    @Override
    public List<JapaneseWordDto> getAllJapaneseWords() {
        return japaneseWordRepository.findAll().stream().map(JapaneseWordMapper::mapToJapaneseWordDto).collect(Collectors.toList());
    }

    @Override
    public JapaneseWordDto updateJapaneseWord(Long wordId, JapaneseWordDto japaneseWordDto) {
        JapaneseWord japaneseWord = japaneseWordRepository.findById(wordId).orElseThrow(() ->
                new ResourceNotFoundException("Japanese word is not exists with given id: " + wordId));

        japaneseWord.setHiragana(japaneseWordDto.getHiragana());
        japaneseWord.setKatakana(japaneseWordDto.getKatakana());
        japaneseWord.setKanji(japaneseWord.getKanji());
        japaneseWord.setWords(japaneseWord.getWords());

        return JapaneseWordMapper.mapToJapaneseWordDto(japaneseWordRepository.save(japaneseWord));
    }

    @Override
    public void deleteJapaneseWord(Long wordId) {
        japaneseWordRepository.findById(wordId).orElseThrow(() ->
                new ResourceNotFoundException("Japanese word is not exists with given id: " + wordId));
        japaneseWordRepository.deleteById(wordId);
    }
}
