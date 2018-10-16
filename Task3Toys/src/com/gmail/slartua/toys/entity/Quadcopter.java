package com.gmail.slartua.toys.entity;

public class Quadcopter extends RadioControlled {
	private boolean camera;

	public Quadcopter() {
		super();
	}

	public Quadcopter(String brandName, int ageFrom, double price, int range, String color, boolean camera) {
		super(brandName, ageFrom, price, range, color);
		this.camera = camera;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + " camera=" + camera + "]";
	}
	
	

}
