package com.xado.Service;

import com.xado.Todo.Todo;
import com.xado.Todo.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public class ServiceIml implements Service{
    @Autowired
    @Qualifier("todoDao")
    TodoDao tododao;




    public void add(Todo todo) {
    tododao.add(todo);
    }

    public void delete(Todo todo) {
tododao.delete(todo);
    }

    public void delete(int id) {
tododao.delete(id);
    }

    public List<Todo> getAll() {
        return tododao.getAll();
    }
}
