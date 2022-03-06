package com.mytodolist.dto;

import com.mytodolist.model.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoDtoConvertor {

    //this is for converting Todo class to TodoDto
    public TodoDto convert(Todo from){
        return new TodoDto(from.getTitle(), from.getTodoText(), from.getCompleted());
    }
}
