package org.web;


import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {

    @Test
    @DisplayName("Hello World")
    void helloWorld() throws Exception {
        System.out.println("Hello World!");
    }

    @Test
    @DisplayName("ArgumentTest")
    void testArgument() {
    var app = App.main(new String[]{
            "work",
            "--add",
            "-do", "1",
            "-t", "xx/xx/xx",
            "-c", "xxxxxxx",
    });

    Assertions.assertEquals(app.getFiles(), new ArrayList<>(){{add("work");}});
    Assertions.assertEquals(app.getContent(), "xxxxxxx");
    Assertions.assertEquals(app.getDate(), "xx/xx/xx");
    Assertions.assertEquals(app.getDone(), 1);
    Assertions.assertEquals(app.isAdd(), true);
    Assertions.assertEquals(app.isDelete(), false);
    Assertions.assertEquals(app.isHelp(), false);
    Assertions.assertEquals(app.isPrint(), false);;

    }
}
