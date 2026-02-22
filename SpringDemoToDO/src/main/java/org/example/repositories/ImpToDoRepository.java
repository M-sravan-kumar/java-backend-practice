package org.example.repositories;

import org.example.dto.TodoDto;
import org.example.schema.Todo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("dev")
public class ImpToDoRepository implements ITodoRepository {

    private List<Todo> todoList = new ArrayList<>();

    public ImpToDoRepository() {
        // Initialize with 4 default todo entries
        Todo todo1 = new Todo(1, "Complete Spring Boot project");
        Todo todo2 = new Todo(2, "Review code and fix bugs");
        Todo todo3 = new Todo(3, "Write unit tests");
        Todo todo4 = new Todo(4, "Deploy application to server");

        todoList.add(todo1);
        todoList.add(todo2);
        todoList.add(todo3);
        todoList.add(todo4);
    }

    @Override
    public List<TodoDto> getTodos() {
        List<TodoDto> todoDtoList = new ArrayList<>();
        for (Todo todo : todoList) {
            TodoDto todoDto = new TodoDto(todo.getId(), todo.getContent());
            todoDtoList.add(todoDto);
        }
        return todoDtoList;
    }

    @Override
    public void addTodo(TodoDto todoDto) {
        Todo todo = new Todo(todoDto.getId(), todoDto.getContent());
        todoList.add(todo);
    }

    @Override
    public void deleteTodo(Integer id) {
        todoList.remove(id);
    }

    @Override
    public void updateTodo(TodoDto todoDto) {
        for (Todo i : todoList) {
            if (i.getId().equals(todoDto.getId())) {
                i.setContent(todoDto.getContent());
                break;
            }
        }
    }

}
