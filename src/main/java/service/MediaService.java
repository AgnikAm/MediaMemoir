package service;

import model.Media;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class MediaService<T extends Media> {

    @Autowired
    private MongoRepository<T, ObjectId> repository;

    public List<T> getAll() {
        return repository.findAll();
    }

    public Optional<T> getById(ObjectId id) {
        return repository.findById(id);
    }

    public T add(T entity) {
        return repository.save(entity);
    }

    public T update(ObjectId id, T entity) {
        if (!repository.existsById(id)) {
            return null;
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public boolean delete(ObjectId id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
