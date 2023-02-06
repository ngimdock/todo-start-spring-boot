package com.todo.todo;

import java.util.ArrayList;
import java.util.List;

import com.todo.todo.entities.Todo;

public class TodoService {
  

  List<Todo> todos = new ArrayList<Todo>();

  public TodoService() {
    todos.add(new Todo(1, "Learn Spring", true));
    todos.add(new Todo(2, "Learn Spring2", false));
    todos.add(new Todo(3, "Learn Spring3", true));
  }

  public List<Todo> findAll() {
    return todos;
  }

  public Todo findOne(int todoId) {
    for (Todo todo : todos) {
      if (todo.getId() == todoId) return todo;
    }
    return null;
  }

  public void deleteOe(int todoId) {
    for (Todo todo : todos) {
      if (todo.getId() == todoId) {
        todos.remove(todo);
        return;
      }
    }
  }
}
