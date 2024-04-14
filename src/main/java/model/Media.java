package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Media {
    @Id
    private ObjectId id;
    private String title;
    private List<String> genres;
    private String image;
    private float rating;
}
