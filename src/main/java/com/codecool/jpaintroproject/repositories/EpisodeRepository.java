package com.codecool.jpaintroproject.repositories;

import com.codecool.jpaintroproject.entities.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {
    Episode findByTitleContaining(String title);
}
