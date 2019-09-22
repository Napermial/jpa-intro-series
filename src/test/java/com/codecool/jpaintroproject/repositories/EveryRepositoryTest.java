package com.codecool.jpaintroproject.repositories;

import com.codecool.jpaintroproject.entities.Episode;
import com.codecool.jpaintroproject.entities.Series;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


import java.time.LocalDate;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class EveryRepositoryTest {

    @Autowired
    EpisodeRepository episodeRepository;

    @Autowired
    SeasonRepository seasonRepository;

    @Autowired
    SeriesRepository  seriesRepository;

    @Test
    public void canFindEpisodeByTitle() {
        Episode episode = Episode.builder()
                .title("Whither Canada?")
                .aired(LocalDate.of(5, 8, 1969))
                .build();
        episodeRepository.save(episode);

        Episode savedEpisode = episodeRepository.findByTitleContaining("Whither Canada?");

        assertThat(savedEpisode).isEqualTo(episode);
    }

}