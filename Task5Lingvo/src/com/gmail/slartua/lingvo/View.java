package com.gmail.slartua.lingvo;

import java.util.Scanner;

public class View {
    private static Scanner sc = new Scanner(System.in);

    public static void printMessage(String message){
        System.out.println(message);
    }
    public static String inputSentenceToTranslate(){
        printMessage("Input sentence to translate");
        String value = sc.nextLine();
        return value.toLowerCase();
    }
    public static String inputEnglishWord(){
        String value;
        while(true){
            printMessage("Input english word");
            if(sc.hasNextLine()){
                value = sc.nextLine();
                if(value.matches("[a-zA-Z]*"))
                    break;
            } else sc.next();
            printMessage("Wrong syntaxes");
        }
        return value;
    }
    public static String inputRussianWord(){
        String value;
        while(true){
            printMessage("Введите слово на русском");
            if(sc.hasNextLine()){
                value = sc.nextLine();
                if(value.matches("[а-яА-Я]*"))
                    break;
            } else sc.next();
            printMessage("Wrong syntaxes");
        }
        return value;
    }
    public static int inputNumberOfWords(){
        int value;
        while (true) {
            printMessage("Input number of words U want to add:");
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value > 0) break;
            } else sc.next();
            printMessage("Input more than 0");
        }
        return value;
    }





}
