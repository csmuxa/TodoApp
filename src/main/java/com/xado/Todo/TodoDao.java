package com.xado.Todo;

import org.springframework.stereotype.Component;

import java.util.List;


public interface TodoDao {
    void add(Todo todo);
    void delete(Todo todo);
    void delete(int id);
    List<Todo> getAll();
}
