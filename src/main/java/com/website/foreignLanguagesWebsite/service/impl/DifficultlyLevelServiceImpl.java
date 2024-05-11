package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.DifficultlyLevelDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.DifficultlyLevelMapper;
import com.website.foreignLanguagesWebsite.repository.DifficultlyLevelRepository;
import com.website.foreignLanguagesWebsite.service.DifficultlyLevelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DifficultlyLevelServiceImpl implements DifficultlyLevelService {
    private DifficultlyLevelRepository difficultlyLevelRepository;
    @Override
    public DifficultlyLevelDto createDifficultlyLevel(DifficultlyLevelDto difficultlyLevelDto) {
        return DifficultlyLevelMapper
                .mapToDifficultlyLevelDto(difficultlyLevelRepository
                        .save(DifficultlyLevelMapper
                                .mapToDifficultlyLevel(difficultlyLevelDto)));
    }

    @Override
    public DifficultlyLevelDto getDifficultlyLevelById(Long difficultlyLevelId) {
        return DifficultlyLevelMapper.mapToDifficultlyLevelDto(difficultlyLevelRepository.findById(difficultlyLevelId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Difficultly level is not exists with given id: " + difficultlyLevelId)));
    }

    @Override
    public List<DifficultlyLevelDto> getAllDifficultlyLevels() {
        return difficultlyLevelRepository.findAll().stream().map((level) -> DifficultlyLevelMapper.mapToDifficultlyLevelDto(level)).collect(Collectors.toList());
    }
}
