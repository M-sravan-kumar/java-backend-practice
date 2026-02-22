package org.example.repositories;

import org.example.dto.TodoDto;
import org.example.schema.Todo;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Profile("prod")
public class ImpMapToDoRepository implements ITodoRepository {

    Map<Integer, String> todoMap = new HashMap<>();

    public ImpMapToDoRepository() {
        // Initialize with 4 different todo entries
        todoMap.put(1, "Learn microservices architecture");
        todoMap.put(2, "Implement JWT authentication");
        todoMap.put(3, "Configure MySQL database");
        todoMap.put(4, "Create API documentation with Swagger");
    }

    @Override
    public List<TodoDto> getTodos() {

        List<TodoDto> todoDtoList = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : todoMap.entrySet()) {
            TodoDto todoDto = new TodoDto(entry.getKey(), entry.getValue());
            todoDtoList.add(todoDto);
        }

        return todoDtoList;
    }

    @Override
    public void addTodo(TodoDto todoDto) {

        todoMap.put(todoDto.getId(), todoDto.getContent());
    }

    @Override
    public void deleteTodo(Integer id) {
        todoMap.remove(id);
    }

    @Override
    public void updateTodo(TodoDto todoDto) {
        todoMap.put(todoDto.getId(), todoDto.getContent());
    }

}
