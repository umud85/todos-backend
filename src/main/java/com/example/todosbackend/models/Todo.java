package com.example.todosbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "initialTodos")
public record Todo(@Id String Id, String title, boolean done) {
}
