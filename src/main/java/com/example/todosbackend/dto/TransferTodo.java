package com.example.todosbackend.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class TransferTodo {

    String id;

    String title;

    boolean done;

}
