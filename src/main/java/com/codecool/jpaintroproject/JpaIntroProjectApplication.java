package com.codecool.jpaintroproject;

import com.codecool.jpaintroproject.entities.Episode;
import com.codecool.jpaintroproject.repositories.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaIntroProjectApplication {

    final
    EpisodeRepository episodeRepository;

    public JpaIntroProjectApplication(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaIntroProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args -> {

        };
    }

}
