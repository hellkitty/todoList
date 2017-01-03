package com.dinky.todoList.domain;

import java.util.Date;

/**
 * Created by Dinky on 2017. 1. 1..
 */
public class TodoListVO {
    private int todo_id;
    private String content;
    private Date rgst_date;
    private Date updt_date;
    private boolean flag;
    private int folder_id;

    public TodoListVO() {
    }

    public TodoListVO(int todo_id, String content, Date rgst_date, Date updt_date, boolean flag, int folder_id) {
        this.todo_id = todo_id;
        this.content = content;
        this.rgst_date = rgst_date;
        this.updt_date = updt_date;
        this.flag = flag;
        this.folder_id = folder_id;
    }

    public int getTodo_id() {
        return todo_id;
    }

    public void setTodo_id(int todo_id) {
        this.todo_id = todo_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRgst_date() {
        return rgst_date;
    }

    public void setRgst_date(Date rgst_date) {
        this.rgst_date = rgst_date;
    }

    public Date getUpdt_date() {
        return updt_date;
    }

    public void setUpdt_date(Date updt_date) {
        this.updt_date = updt_date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    @Override
    public String toString() {
        return "TodoListVO{" +
                "todo_id=" + todo_id +
                ", content='" + content + '\'' +
                ", rgst_date=" + rgst_date +
                ", updt_date=" + updt_date +
                ", flag=" + flag +
                ", folder_id=" + folder_id +
                '}';
    }
}
