package com.gmail.slartua.journal.View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputNumberOfStudent(View view){
        int value;
        while (true){
            view.printMessage(View.INPUT_NUMBER_OF_STUDENTS);
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(value > 0) break;
            }else scanner.next();
            view.printMessage("Input more than 0");
        }
        return value;
    }

    public static String inputFirstName(View view){
        String value;
        while(true){
            view.printMessage(View.INPUT_FIRST_NAME);
            if(scanner.hasNextLine()){
                value = scanner.nextLine();
                if(value.matches("[A-Z][a-zA-Z]*"))
                    break;
            } else scanner.next();
            view.printMessage(View.WRONG_NAME);
        }
        return value;
    }

    public static String inputSecondName(View view){
        String value;
        while(true){
            view.printMessage(View.INPUT_SECOND_NAME);
            if(scanner.hasNextLine()){
                value = scanner.nextLine();
                if(value.matches("[A-Z][a-zA-Z]*"))
                    break;
            } else scanner.next();
            view.printMessage(View.WRONG_NAME);
        }
        return value;
    }
    public static LocalDate inputDateOfBirth(View view){
        String value;
        LocalDate localDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while(true){
            view.printMessage(View.INPUT_DATE_OF_BIRTH);
            if(scanner.hasNextLine()){
                value = scanner.nextLine();
                if(value.matches("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d{2})")){
                    localDate = LocalDate.parse(value, formatter);
                    break;
                }
            } else scanner.next();
            view.printMessage(View.WRONG_DATE_OF_BIRTH);
        }
        return localDate;
    }

    public static String inputPhoneNumber(View view){
        String value;
        while(true){
            view.printMessage(View.INPUT_PHONE_NUMPER);
            if(scanner.hasNextLine()){
                value = scanner.nextLine();
                if(value.matches("\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}"))
                    break;
            } else scanner.next();
            view.printMessage(View.WRONG_PHONE_NUMPER);
        }
        return value;
    }

    public static String inputAdress(View view){
        String value;
        while(true){
            view.printMessage(View.INPUT_ADRESS);
            if(scanner.hasNextLine()){
                value = scanner.nextLine();
                if(value.matches("[A-Z][a-zA-z]*, \\d*, \\d*"))
                    break;
            } else scanner.next();
            view.printMessage(View.WRONG_ADRESS);
        }
        return value;
    }


}
