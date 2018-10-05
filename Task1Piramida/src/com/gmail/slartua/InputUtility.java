package com.gmail.slartua;

import java.util.Scanner;

public class InputUtility {
	private static Scanner sc = new Scanner(System.in);

	public static int inputPositiveIntValueWithScanner(PiramidaView view) {
		view.printMessage(PiramidaView.INPUT_INT_DATA);

		while (!sc.hasNextInt()) {
			view.printMessage(PiramidaView.WRONG_INT_DATA + PiramidaView.INPUT_INT_DATA);
			sc.next();
		}
		int i = sc.nextInt();
		if (i > 0 && i < 10) {
			return i;
		} else {
			view.printMessage(PiramidaView.WRONG_INT_DATA + PiramidaView.INPUT_INT_DATA);
			sc.next();
		}
		return sc.nextInt();

	}
}
