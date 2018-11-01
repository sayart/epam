package com.gmail.slartua;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static int inputCollectionSize(){
        int value;
        while (true){
            printMessage("Input collection size");
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(value > 0) break;
            }else scanner.next();
            printMessage("Input positive integer");
        }
        return value;
    }
    public static int inputMinValue(){
        int value;
        while (true){
            printMessage("Input min value");
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(value >= 0) break;
            }else scanner.next();
            printMessage("Input positive integer");
        }
        return value;
    }
    public static int inputMaxValue(){
        int value;
        while (true){
            printMessage("Input max value");
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(value > 0) break;
            }else scanner.next();
            printMessage("Input positive integer");
        }
        return value;
    }
}
