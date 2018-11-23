package com.epam.task61.util;

import com.epam.task61.view.BookView;
import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(BookView view) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputString(BookView view) {
        while (true) {
            view.printMessage(view.INPUT_STRING_DATA);
            String text = sc.next();
            if ( Validator.isCorrectString(text)) {
                return text;
            }
            view.printError(BookView.WRONG_INPUT_DATA);
        }
    }
}
