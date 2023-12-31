package com.example.todosbackend.controllers;

import com.example.todosbackend.dto.TransferTodo;
import com.example.todosbackend.models.Todo;
import com.example.todosbackend.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @CrossOrigin
    @GetMapping("/api/todos")
    public List<TransferTodo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @CrossOrigin
    @PostMapping("/api/todos")
    public Todo addTodo(@RequestBody TransferTodo transferTodo) {
        return todoService.addTodo(transferTodo);
    }
}
