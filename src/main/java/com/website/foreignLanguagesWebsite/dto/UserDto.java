package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.reference.LanguageLevel;
import com.website.foreignLanguagesWebsite.entity.wordentity.Word;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private LanguageLevel languageLevel;
    private List<Word> words = new ArrayList<>() {
    };
}
