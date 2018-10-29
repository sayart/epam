package com.gmail.slartua.view;

import com.gmail.slartua.tours.model.entity.Transport;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMenu(View view){
        int value;
        while (true) {
            view.printMessage(View.CHOOSE_TOUR + View.MENU1);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0 && value < 5){
                    break;
                }
            } else scanner.next();
            view.printMessage("Wrong number! ");
        }
        return value;
    }

    public static String inputTransport(View view){
        int value;
        while (true) {
            view.printMessage(View.CHOOSE_TRANSPORT + View.MENU2);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0 && value < 4){
                    break;
                }
            } else scanner.next();
            view.printMessage("Wrong number! ");
        }
        switch (value){
            case 1: return Transport.BUS.getTransportType();
            case 2: return Transport.PLANE.getTransportType();
            case 3: return Transport.SHIP.getTransportType();
            default: return "Transport";
        }
    }

    public static int inputMinimumDays(View view){
        int value;
        while (true) {
            view.printMessage(View.INPUT_DAYS);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0){
                    break;
                }
            } else scanner.next();
            view.printMessage("Wrong number! ");
        }
        return value;
    }
    public static int inputPriceToSort(View view){
        int value;
        while (true) {
            view.printMessage(View.INPUT_PRICE);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0){
                    break;
                }
            } else scanner.next();
            view.printMessage("Wrong number! ");
        }
        return value;
    }


}
