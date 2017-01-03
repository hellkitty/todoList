package com.dinky.todoList.controller;

import com.dinky.todoList.service.TodoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dinky on 2017. 1. 1..
 */
@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public @ResponseBody int insertTodoReq(@Param("content") String content) {
        System.out.println(content);
        return service.insertTodo(content);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public @ResponseBody Object selectTodoListReq() {
        return service.selectTodolist();
    }

    @RequestMapping(value = "/todo", method = RequestMethod.DELETE)
    public @ResponseBody int deleteTodoReq(Integer todo_id) {
        return service.deleteTodolist(todo_id);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.PUT)
    public @ResponseBody int updateTodoReq(@Param("todo_id")int todo_id
                                             ,@Param("content") String content
                                             ,@Param("flag") boolean flag) {
        return service.updateTodolist(todo_id, content, flag);
    }
}
