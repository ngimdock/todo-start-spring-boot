package com.todo.todo;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.entities.Todo;

@RestController
@RequestMapping("/todos")
public class TodoController {

  private TodoService todoService = new TodoService();

  @GetMapping()
  public List<Todo> findAll() {
    return todoService.findAll();
  }

  @GetMapping("/{todoId}")
  public Todo findOne(@PathVariable int todoId) {

    System.out.println(todoId);
    return todoService.findOne(todoId);
  }

  @GetMapping("/delete/{todoId}")
  public void deleteOne(@PathVariable int todoId) {
    todoService.deleteOe(todoId);
  }
}
