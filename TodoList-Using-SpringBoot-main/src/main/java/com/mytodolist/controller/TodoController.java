package com.mytodolist.controller;

import com.mytodolist.dto.CreateTodoRequest;
import com.mytodolist.dto.TodoDto;
import com.mytodolist.dto.UpdateTodoRequest;
import com.mytodolist.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo/v1")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos(){
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto>getTodoById(@PathVariable("id") Long id){
        return ResponseEntity.ok(todoService.getTodoById(id));
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }
}
