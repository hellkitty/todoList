package com.dinky.todoList.mappers;

import com.dinky.todoList.domain.TodoListVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Dinky on 2017. 1. 1..
 */
@Mapper
public interface TodoMapper {

    @Insert("insert into todolist values(#{todo_id}, #{content}, now(), now(), false, null)")
    int insertTodo(@Param("todo_id")int todo_id, @Param("content")String content);

    @Select("select ifnull(max(todo_id)+1 ,0) from todolist")
    int selectMaxId();

    @Select("select * from todolist")
    List<TodoListVO> selectTodoList();

    @Delete("delete from todolist where todo_id = #{todo_id}")
    int deleteTodolist(@Param("todo_id") int todo_id);

    @Update("update todolist set content = #{content}, flag = #{flag} where todo_id = #{todo_id}")
    int updateTotoList(@Param("todo_id") int todo_id, @Param("content") String content, @Param("flag") boolean flag);
}
