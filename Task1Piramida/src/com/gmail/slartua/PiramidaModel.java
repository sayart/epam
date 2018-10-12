package com.gmail.slartua;

public class PiramidaModel {
	private int height;

	public PiramidaModel() {
		super();
	}
	public PiramidaModel(int height) {
		super();
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void drawPiramid() {
		int n = 1;
		for (int lines = 0; lines < height; lines++) {
			for (int column = 0; column < 2 * height - 1; column++) {
				if (column <= height - 2 - lines || column >= height + lines) {
					System.out.print(" ");
				} else {
					System.out.print(n);
					if (column < height - 1) {
						n++;
					} else {
						n--;
					}
				}
			}
			System.out.println();
			n = 1;
		}
	}
}
