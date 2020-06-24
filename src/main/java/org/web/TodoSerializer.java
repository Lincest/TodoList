package org.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用于Todo项的序列化与反序列化
 *
 * 读取 / 写入 list.json文件
 */
public class TodoSerializer {

    private static String  filePath = "./list.json";

    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(String filePath) {
        TodoSerializer.filePath = filePath;
    }

    public static void SerializeAndWrite(List<Todo> todo) {  // 序列化并写入todo
        String jsonOutput = JSON.toJSONString(todo);
        FileUtil.WriteFile(filePath, jsonOutput);
    }

    public static List<Todo> ReadAndUnserialize() {  // 读取json文件, 反序列化并返回List<Todo>对象
        String jsonContent = FileUtil.ReadFile(filePath);
        List<Todo> todo = JSON.parseArray(jsonContent, Todo.class);
        return todo;
    }


}