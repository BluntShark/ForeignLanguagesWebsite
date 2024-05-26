package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import com.website.foreignLanguagesWebsite.entity.userentity.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LanguageLevelDto {
    private Long id;
    private String title;
    private List<Test> test;
}
