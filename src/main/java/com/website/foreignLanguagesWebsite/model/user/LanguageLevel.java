package com.website.foreignLanguagesWebsite.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LanguageLevel {
    private Long id;
    private String title;
    private String description;
}
