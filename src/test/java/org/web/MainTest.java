package org.web;


import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("Hello World")
    void helloWorld() throws Exception {
        System.out.println("Hello World!");
    }
}
