package com.mytodolist.dto;

public class TodoDto {
    private String title;
    private String todoText;
    private Boolean completed;

//    This is for data transfer process. I am not using the Todo class diretcly for safeyt

    public TodoDto() {
    }

    public TodoDto(String title, String todoText, Boolean completed) {
        this.title = title;
        this.todoText = todoText;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
