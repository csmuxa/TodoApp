package com.xado.Todo;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Todo {
    @NotNull
    private int id;
    @Size(min = 2,message = "Minimal characters 2")

    private String title;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
