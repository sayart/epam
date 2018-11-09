package com.gmail.slartua.reflection;

import com.gmail.slartua.arifmetic.Runner;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try {
            new Runner().run();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException |
                InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
