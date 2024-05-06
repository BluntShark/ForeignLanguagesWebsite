package com.website.foreignLanguagesWebsite.repository;

import com.website.foreignLanguagesWebsite.entity.wordentity.PartOfSpeech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartOfSpeechRepository extends JpaRepository<PartOfSpeech, Long> {
}
