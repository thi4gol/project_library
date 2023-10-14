package project.com.br.register.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.com.br.register.model.User;

public interface UserRepository extends MongoRepository<User,String>{
    
}