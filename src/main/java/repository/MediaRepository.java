package repository;

import model.Book;
import model.Media;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MediaRepository<T extends Media> extends MongoRepository<T, ObjectId> {
}
