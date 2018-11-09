package com.gmail.slartua.reflection;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Runner {
    public void run() throws NoSuchFieldException,
            IllegalAccessException{
        String string = "Hello";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input string");
//        String string = sc.nextLine();
        System.out.println(string);
        Class<?> clazz= string.getClass();
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(string, "New value".toCharArray());
        System.out.println(string);
        System.out.println("Hello".equals("New value"));
    }
}
