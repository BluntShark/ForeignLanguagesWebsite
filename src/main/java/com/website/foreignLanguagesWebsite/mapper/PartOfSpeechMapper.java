package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.PartOfSpeechDto;
import com.website.foreignLanguagesWebsite.dto.WordDto;
import com.website.foreignLanguagesWebsite.entity.word.PartOfSpeech;
import com.website.foreignLanguagesWebsite.entity.word.Word;

public class PartOfSpeechMapper {
    public static PartOfSpeechDto mapToPartOfSpeechDto(PartOfSpeech partOfSpeech){
        return new PartOfSpeechDto(
                partOfSpeech.getId(),
                partOfSpeech.getPartOfSpeech()
        );
    }
    public static PartOfSpeech mapToPartOfSpeech(PartOfSpeechDto partOfSpeechDto){
        return new PartOfSpeech(
                partOfSpeechDto.getId(),
                partOfSpeechDto.getPartOfSpeech()
        );
    }
}
