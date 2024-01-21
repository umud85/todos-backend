package com.example.todosbackend.services;

import com.example.todosbackend.dto.TransferTodo;
import com.example.todosbackend.models.Todo;
import com.example.todosbackend.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo addTodo(TransferTodo transferTodo) {
        Todo todo = new Todo(transferTodo.getId(), transferTodo.getTitle(), transferTodo.isDone());
        return todoRepository.save(todo);
    }
}
