package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.LanguageLevelDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.LanguageLevelMapper;
import com.website.foreignLanguagesWebsite.repository.LanguageLevelRepository;
import com.website.foreignLanguagesWebsite.service.LanguageLevelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class LanguageLevelImpl implements LanguageLevelService {
    private LanguageLevelRepository languageLevelRepository;
    @Override
    public LanguageLevelDto createLanguageLevel(LanguageLevelDto languageLevelDto) {
        return LanguageLevelMapper
                .mapToLanguageLevelDto(languageLevelRepository
                        .save(LanguageLevelMapper
                                .mapToLanguageLevel(languageLevelDto)));
    }

    @Override
    public LanguageLevelDto getLanguageLevelById(Long languageLevelId) {
        return LanguageLevelMapper.mapToLanguageLevelDto(languageLevelRepository.findById(languageLevelId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Language level is not exists with given id: " + languageLevelId)));
    }

    @Override
    public List<LanguageLevelDto> getAllLanguageLevels() {
        return languageLevelRepository.findAll().stream().map((level) -> LanguageLevelMapper.mapToLanguageLevelDto(level)).collect(Collectors.toList());
    }
}
