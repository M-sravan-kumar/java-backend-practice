package org.example.services;

import lombok.AllArgsConstructor;
import org.example.dto.TodoDto;
import org.example.schema.Todo;
import org.example.repositories.ITodoRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private ITodoRepository todoRepository;

    public List<TodoDto> getAllTodos() {
        return todoRepository.getTodos();
    }

    public void addTodo(TodoDto todoDto) {
//        if ID is already there , then throw an exception
        todoRepository.addTodo(todoDto);
    }

    public void deleteTodo(Integer id) {
//        if not there then throw an exception
        todoRepository.deleteTodo(id);
    }

    public void updateTodo(TodoDto todoDto) {
//        if not there , then throw an exception
        todoRepository.updateTodo(todoDto);
    }

}
