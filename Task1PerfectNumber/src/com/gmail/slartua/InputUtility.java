package com.gmail.slartua;

import java.util.Scanner;

public class InputUtility {
	private static Scanner sc = new Scanner(System.in);

	public static int inputPositiveIntValueWithScanner(PerfectNumberView view) {
		view.printMessage(PerfectNumberView.INPUT_INT_DATA);

		while (!sc.hasNextInt()) {
			view.printMessage(PerfectNumberView.WRONG_INT_DATA + PerfectNumberView.INPUT_INT_DATA);
			sc.next();
		}
		int i = sc.nextInt();
		if (i > 0) {
			return i;
		} else {
			view.printMessage(PerfectNumberView.WRONG_INT_DATA + PerfectNumberView.INPUT_INT_DATA);
			sc.next();
		}
		return sc.nextInt();

	}
}
