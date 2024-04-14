package com.mediamemoir.media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.BookRepository;
import repository.GameRepository;
import repository.MovieRepository;
import repository.MusicRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {BookRepository.class, GameRepository.class, MovieRepository.class, MusicRepository.class})
@ComponentScan(basePackages = {"com.mediamemoir.media", "controller"})
public class MediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaApplication.class, args);
	}

}
