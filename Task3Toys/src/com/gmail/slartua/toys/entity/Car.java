package com.gmail.slartua.toys.entity;

public class Car extends RadioControlled{
	private int remoteControlFrequency;

	public Car() {
		super();
	}

	public Car(String brandName, int ageFrom, double price, int range, String color, int remoteControlFrequency) {
		super(brandName, ageFrom, price, range, color);
		this.remoteControlFrequency = remoteControlFrequency;
	}

	public int getRemoteControlFrequency() {
		return remoteControlFrequency;
	}

	public void setRemoteControlFrequency(int remoteControlFrequency) {
		this.remoteControlFrequency = remoteControlFrequency;
	}

	@Override
	public String toString() {
		return super.toString() +
				" remoteControlFrequency=" + remoteControlFrequency + "]";
	}	
}
