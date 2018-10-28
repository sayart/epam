package com.gmail.slartua.tours.model.entity;

public class Excursion extends Tour{
	private String name;
	private boolean guide;
	
	public Excursion() {
		super();
	}
	public Excursion(double price, int days, String country, boolean allInclusive, String transport, String name, boolean guide) {
		super(price, days, country, allInclusive, transport);
		this.name = name;
		this.guide = guide;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGuide() {
		return guide;
	}
	public void setGuide(boolean guide) {
		this.guide = guide;
	}

	@Override
	public String toString() {
		return super.toString() +
				"name='" + name + '\'' +
				", guide=" + guide +
				'}';
	}
}
