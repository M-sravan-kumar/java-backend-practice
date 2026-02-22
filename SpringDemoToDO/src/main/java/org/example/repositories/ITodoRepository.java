package org.example.repositories;

import org.example.dto.TodoDto;
import org.example.schema.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ITodoRepository {

    public List<TodoDto> getTodos();

    public void addTodo(TodoDto todoDto);

    public void deleteTodo(Integer id);

    public void updateTodo(TodoDto todoDto);
}
