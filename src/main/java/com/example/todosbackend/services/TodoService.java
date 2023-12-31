package com.example.todosbackend.services;

import com.example.todosbackend.dto.TransferTodo;
import com.example.todosbackend.models.Todo;
import com.example.todosbackend.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TransferTodo> getAllTodos() {
        return todoRepository.findAll().stream().map(
                todo -> {
                    TransferTodo transferTodo = new TransferTodo();
                    transferTodo.setId(todo.Id());
                    transferTodo.setTitle(todo.title());
                    transferTodo.setDone(todo.done());
                    return transferTodo;
                }
        ).collect(Collectors.toList());
    }

    public Todo addTodo(TransferTodo transferTodo) {
        Todo todo = new Todo(transferTodo.getId(), transferTodo.getTitle(), transferTodo.getDone());
        return todoRepository.save(todo);
    }
}
