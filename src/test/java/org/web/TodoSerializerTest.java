package org.web;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoSerializerTest {

    private String filePath = TodoSerializer.getFilePath();

    @Test
    void serializeAndWrite() {
        List<Todo> ListofTodo = new ArrayList<Todo>();
        ListofTodo.add(new Todo(1,new Date(),"study",false ));
        ListofTodo.add(new Todo(2,new Date(),"work",false ));
        ListofTodo.add(new Todo(3,new Date(),"work",true ));
        TodoSerializer.SerializeAndWrite(ListofTodo);

        String jsonOutput = JSON.toJSONString(ListofTodo);
        System.out.println(jsonOutput);
        FileUtil.WriteFile(filePath, jsonOutput);
    }

    @Test
    void readAndUnserialize() {
        List<Todo> todo = TodoSerializer.ReadAndUnserialize();
        Todo do1 = todo.get(0); // 获取第一项
        System.out.println(do1.getNO());
        System.out.println(do1.getTime());
        System.out.println(do1.getContent());
        System.out.println(do1.isDone());
    }
}