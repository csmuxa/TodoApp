package com.xado.Service;

import com.xado.Todo.Todo;
import org.springframework.stereotype.Component;

import java.util.List;



public interface Service {
    void add(Todo todo);
    void delete(Todo todo);
    void delete(int id);
    List<Todo> getAll();
}
