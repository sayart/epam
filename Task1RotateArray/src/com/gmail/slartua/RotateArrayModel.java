package com.gmail.slartua;

public class RotateArrayModel {
	private int arraySize;

	public RotateArrayModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RotateArrayModel(int arraySize) {
		super();
		this.arraySize = arraySize;
	}

	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}

//	public void drawArray(int[][] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
//	}

	public int[][] generateArray() {
		int[][] array = new int[arraySize][arraySize];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 100 - (int) (Math.random() * 200);
			}
		}
		return array;
	}

	public int[][] rotateArrayCounterClockWise(int[][] a) {
		int temp;
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = i; j < a.length - 1 - i; j++) {
				temp = a[i][j];
				a[i][j] = a[j][a.length - 1 - i];
				a[j][a.length - 1 - i] = a[a.length - 1 - i][a.length - 1 - j];
				a[a.length - 1 - i][a.length - 1 - j] = a[a.length - 1 - j][i];
				a[a.length - 1 - j][i] = temp;
			}
		}
		return a;
	}

}
