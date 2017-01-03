package com.dinky.todoList.service;

import com.dinky.todoList.domain.TodoListVO;
import com.dinky.todoList.mappers.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dinky on 2017. 1. 1..
 */
@Service
public class TodoService {

    @Autowired
    TodoMapper mapper;

    public int insertTodo(String content) {
        return mapper.insertTodo(mapper.selectMaxId(), content);
    }

    public List<TodoListVO> selectTodolist(){
        return mapper.selectTodoList();
    }

    public int deleteTodolist(int todo_id) {
        return mapper.deleteTodolist(todo_id);
    }

    public int updateTodolist(int todo_id, String content, boolean flag) {
        return mapper.updateTotoList(todo_id, content, flag);
    }
}
