package com.gmail.slartua.arifmetic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public void run() throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        Class<?> clazz = UnaryOperation.class;
        Constructor constructor = clazz.getConstructor();
        UnaryOperation obj = (UnaryOperation) constructor.newInstance();
        System.out.println(obj);

        Method[] methods = clazz.getMethods();
        Method mm = null;
        for(Method method : methods){
            if(method.getName().startsWith("set")){
                method.invoke(obj, 0.0);
                System.out.println(obj);
                break;
            } else if (method.getName().startsWith("inc")){
                method.invoke(obj);
                System.out.println(obj);
            }
        }

    }
}
