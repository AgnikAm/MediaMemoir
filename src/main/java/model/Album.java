package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "albums")
@EqualsAndHashCode(callSuper = false)
public class Album extends Media {
    private String artist;
    private int releaseYear;
    private String duration;
}

