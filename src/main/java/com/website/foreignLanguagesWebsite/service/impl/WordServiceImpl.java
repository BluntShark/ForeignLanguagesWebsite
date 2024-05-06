package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.word.Word;
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
        Word word = WordMapper.mapToWord(wordDto);
        Word savedWord = wordRepository.save(word);
        return WordMapper.mapToWordDto(savedWord);
    }
}
