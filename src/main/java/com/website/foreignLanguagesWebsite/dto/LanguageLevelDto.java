package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.userentity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageLevelDto {
    private Long id;
    private String title;
    private String description;
    private List<User> users;
}
