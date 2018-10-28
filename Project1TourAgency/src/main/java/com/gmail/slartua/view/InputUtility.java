package com.gmail.slartua.view;

import com.gmail.slartua.tours.model.entity.Transport;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputMenu(View view){
        int value = 0;
        view.printMessage(View.CHOOSE_TOUR +
                View.MENU1);
        while (true) {
            value = scanner.nextInt();
            if (value < 1 && value > 4) {
                view.printMessage("Wrong number! "
                        + View.CHOOSE_TOUR);
                scanner.next();
            }
            return value;
        }
    }
    public static String inputTransport(View view){
        int value = 0;
        view.printMessage(View.CHOOSE_TRANSPORT +
                View.MENU2);
        while (true) {
            value = scanner.nextInt();
            if (value < 1 && value > 3) {
                view.printMessage("Wrong number! "
                        + View.CHOOSE_TRANSPORT);
                scanner.next();
            }
            switch (value){
                case 1: return Transport.BUS.getTransportType();
                case 2: return Transport.PLANE.getTransportType();
                case 3: return Transport.SHIP.getTransportType();
            }
        }
    }
    public static int inputMinimumDays(View view){
        int value = 0;
        view.printMessage(View.INPUT_DAYS);
        while (true) {
            value = scanner.nextInt();
            if (value < 1) {
                view.printMessage("Wrong number! "
                        + View.INPUT_DAYS);
                scanner.next();
            }
            return value;
        }
    }
    public static int inputPriceToSort(View view){
        int value = 0;
        view.printMessage(View.INPUT_PRICE);
        while (true) {
            value = scanner.nextInt();
            if (value < 1) {
                view.printMessage("Wrong number! "
                        + View.INPUT_PRICE);
                scanner.next();
            }
            return value;
        }
    }


}
