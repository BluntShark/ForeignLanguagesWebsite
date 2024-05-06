package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.userentity.LanguageLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private LanguageLevel languageLevel;
}
