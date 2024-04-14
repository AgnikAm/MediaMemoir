package controller;

import model.Game;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.GameRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameRepository repo;

    @GetMapping
    public List<Game> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Game> getById(@PathVariable("id") ObjectId id) {
        return repo.findById(id);
    }

    @PostMapping
    public Game add(@RequestBody Game newGame) {
        return repo.save(newGame);
    }

}
