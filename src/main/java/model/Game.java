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
@Document(collection = "games")
@EqualsAndHashCode(callSuper = false)
public class Game extends Media {
    private String platform;
    private String developer;
    private boolean completed;
    private LocalDate completitionDate;
}