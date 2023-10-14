package project.com.br.library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.com.br.library.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    
}
