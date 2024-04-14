package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
@EqualsAndHashCode(callSuper = false)
public class Movie extends Media {
    private String director;
    private String[] cast;
    private LocalDate releaseDate;
    private int durationMinutes;
    private boolean watched;
    private LocalDate watchDate;
}