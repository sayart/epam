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
		int h = height;
		int n = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2 * h - 1; j++) {
				if (j <= h - 2 - i || j >= h + i) {
					System.out.print(" ");
				} else {
					System.out.print(n);
					if (j < h - 1) {
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
