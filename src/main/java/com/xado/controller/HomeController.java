package com.xado.controller;

import com.xado.Service.Service;
import com.xado.Service.ServiceIml;
import com.xado.Todo.Todo;
import com.xado.Todo.TodoDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.validation.Valid;
import java.util.List;

@Controller

public class HomeController {
    @Autowired
    @Qualifier("service")
    Service service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model,Model model2) {
        List<Todo> todos = service.getAll();
        model.addAttribute("todos", todos);
        model2.addAttribute("todo",new Todo());
        return "Hello";
    }

    @RequestMapping(value = "/adding", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("todo")Todo todo, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return "Hello";
        }
model.addAttribute("title",todo.getTitle());
service.add(todo);

        return "redirect:/";
    }
    @RequestMapping(value = "/removing", method = RequestMethod.POST)
    public String delete(@Valid @ModelAttribute("todo")Todo todo, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "Hello";
        }
        model.addAttribute("id",todo.getId());
        service.delete(todo);
        return  "redirect:/";
    }
}

