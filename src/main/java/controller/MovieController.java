package controller;

import model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository repo;

    @GetMapping
    public List<Movie> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getById(@PathVariable("id") ObjectId id) {
        return repo.findById(id);
    }

    @PostMapping
    public Movie add(@RequestBody Movie newMovie) {
        return repo.save(newMovie);
    }

}
