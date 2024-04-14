package controller;

import model.Album;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.MusicRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicRepository repo;

    @GetMapping
    public List<Album> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Album> getById(@PathVariable("id") ObjectId id) {
        return repo.findById(id);
    }

    @PostMapping
    public Album add(@RequestBody Album newAlbum) {
        return repo.save(newAlbum);
    }

}
