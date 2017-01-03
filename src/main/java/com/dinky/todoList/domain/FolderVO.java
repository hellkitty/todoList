package com.dinky.todoList.domain;

/**
 * Created by Dinky on 2017. 1. 1..
 */
public class FolderVO {
    private int folder_id;
    private String folder_name;
    private int folder_pid;
    private int folder_order;

    public FolderVO() {
    }

    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    public String getFolder_name() {
        return folder_name;
    }

    public void setFolder_name(String folder_name) {
        this.folder_name = folder_name;
    }

    public int getFolder_pid() {
        return folder_pid;
    }

    public void setFolder_pid(int folder_pid) {
        this.folder_pid = folder_pid;
    }

    public int getFolder_order() {
        return folder_order;
    }

    public void setFolder_order(int folder_order) {
        this.folder_order = folder_order;
    }

    @Override
    public String toString() {
        return "FolderVO{" +
                "folder_id=" + folder_id +
                ", folder_name='" + folder_name + '\'' +
                ", folder_pid=" + folder_pid +
                ", folder_order=" + folder_order +
                '}';
    }
}
