package com.codecool.jpaintroproject;

import com.codecool.jpaintroproject.entities.Episode;
import com.codecool.jpaintroproject.entities.Season;
import com.codecool.jpaintroproject.entities.Series;
import com.codecool.jpaintroproject.repositories.EpisodeRepository;
import com.codecool.jpaintroproject.repositories.SeasonRepository;
import com.codecool.jpaintroproject.repositories.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
public class JpaIntroProjectApplication {


    private SeasonRepository seasonRepository;
    private SeriesRepository seriesRepository;
    private EpisodeRepository episodeRepository;

    public JpaIntroProjectApplication(SeasonRepository seasonRepository, SeriesRepository seriesRepository, EpisodeRepository episodeRepository) {
        this.seasonRepository = seasonRepository;
        this.seriesRepository = seriesRepository;
        this.episodeRepository = episodeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaIntroProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args -> {

            IntStream.range(1,10).forEach(x -> episodeRepository.save(Episode.builder().aired(LocalDate.now()).tvAiredOn(TvAiredOn.BBC1).title("episode"+x).build()));
            IntStream.range(1,10).forEach(x -> seasonRepository.save(Season.builder().episodes(episodeRepository.findAll()).build()));
            seriesRepository.save(Series.builder().seasons(seasonRepository.findAll()).title("series").build());
        };
    }

}
