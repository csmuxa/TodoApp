package com.xado.controller;

import com.xado.Service.Service;
import com.xado.Service.ServiceIml;
import com.xado.Todo.Todo;
import com.xado.Todo.TodoDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class HomeController {
    @Autowired
    @Qualifier("service")
Service service;



    @RequestMapping(value = "/",method = RequestMethod.GET)
public  String list(Model model){
        List<Todo> todos=service.getAll();
        model.addAttribute("todos",todos);
        return "Hello";
    }
}
