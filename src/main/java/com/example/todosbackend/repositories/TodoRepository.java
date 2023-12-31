package com.example.todosbackend.repositories;

import com.example.todosbackend.models.Todo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, ObjectId> {
}
