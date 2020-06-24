package org.web;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 一条Todo项
 * NO : 序号
 * Time : 时间
 * Content : 内容
 * Done : 完成与否
 */
import java.util.Date;

public class Todo {
    private Integer NO;
    private Date Time;
    private String Content;
    private boolean Done;

    public Todo(int NO, Date time, String content, boolean done) {
        this.NO = NO;
        Time = time;
        Content = content;
        Done = done;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public boolean isDone() {
        return Done;
    }

    public void setDone(boolean done) {
        Done = done;
    }
}
