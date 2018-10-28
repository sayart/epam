package com.gmail.slartua.tours.model.entity;

public class HealthyTour extends Tour{
	private String manipulationTreatment;
	private boolean thermalSPA;
	private boolean mineralSPA;
		

	public HealthyTour() {
		super();
	}
	public HealthyTour(double price, int days, String country, boolean allInclusive, String transport, String manipulationTreatment, boolean thermalSPA, boolean mineralSPA) {
		super(price, days, country, allInclusive, transport);
		this.manipulationTreatment = manipulationTreatment;
		this.thermalSPA = thermalSPA;
		this.mineralSPA = mineralSPA;
	}
	public String getManipulationTreatment() {
		return manipulationTreatment;
	}
	public void setManipulationTreatment(String manipulationTreatment) {
		this.manipulationTreatment = manipulationTreatment;
	}
	public boolean getThermalSPA() {
		return thermalSPA;
	}
	public void setThermalSPA(boolean thermalSPA) {
		this.thermalSPA = thermalSPA;
	}
	public boolean getMineralSPA() {
		return mineralSPA;
	}
	public void setMineralSPA(boolean mineralSPA) {
		this.mineralSPA = mineralSPA;
	}

	@Override
	public String toString() {
		return super.toString() +
				"manipulationTreatment='" + manipulationTreatment + '\'' +
				", thermalSPA=" + thermalSPA +
				", mineralSPA=" + mineralSPA +
				'}';
	}
}
