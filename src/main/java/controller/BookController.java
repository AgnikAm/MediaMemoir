package controller;

import model.Book;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import repository.MediaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getById(@PathVariable("id") ObjectId id) {
        return repo.findById(id);
    }

    @PostMapping
    public Book add(@RequestBody Book newBook) {
        return repo.save(newBook);
    }

}
