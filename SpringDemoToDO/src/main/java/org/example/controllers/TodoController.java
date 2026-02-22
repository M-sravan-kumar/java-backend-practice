package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.dto.TodoDto;
import org.example.schema.Todo;
import org.example.services.TodoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    @PostMapping("/add")
    public void addTodo(@RequestBody TodoDto todoDto) {
        todoService.addTodo(todoDto);
    }

    @GetMapping("/getall")
    public List<TodoDto> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PutMapping("/update")
    public void updateTodo(@RequestBody TodoDto todoDto) {
        todoService.updateTodo(todoDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTodo(@PathVariable Integer id) {
        todoService.deleteTodo(id);
    }

}
