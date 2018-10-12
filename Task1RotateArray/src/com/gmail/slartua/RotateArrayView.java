package com.gmail.slartua;

public class RotateArrayView {
	public static final String INPUT_INT_DATA = "Enter size of array: ";
	public static final String WRONG_INT_DATA = "Wrong input! Repeat please! ";
	public static final String OUR_ROTATE_90_DEGREE = "The array rotated counterclock-wise on 90 degree: ";

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void drawArray(int[][] array) {
		for (int[] line : array) {
			for(int column: line) {
				System.out.print(column + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
}	
