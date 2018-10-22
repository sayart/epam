package com.gmail.slartua.shop.view;

import java.util.Scanner;

public class InputUtility {
	private static Scanner sc = new Scanner(System.in);
	
	public static String inputDeviceStoreName(View view) {
		view.printMessage(View.INPUT_DEVICE_STORE_NAME);
		return sc.nextLine();
	}
	public static int inputNumberOfDepartments(View view) {
		int value = 0;
		view.printMessage(View.INPUT_NUMBER_OF_DEPARTMENTS);
		while (true) {
			value = sc.nextInt();
			if (value < 1) {
				view.printMessage("Wrong number! " 
						+ View.INPUT_NUMBER_OF_DEPARTMENTS);
				sc.next();
			}
			return value;
		}
	}
	public static String inputDepartmentName(View view) {
		view.printMessage(View.INPUT_DEPARTMENT_NAME);
		sc.next();
		return sc.nextLine();
	}
	public static String[] inputDevices(View view) {
		view.printMessage(View.INPUT_DEVICES);
		String[] temp = sc.nextLine().split(", ");
		return temp;
	}
}
