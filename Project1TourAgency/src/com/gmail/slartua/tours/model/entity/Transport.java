package com.gmail.slartua.tours.model.entity;

public enum Transport {
	BUS("Bus"), PLANE("Plane"), SHIP("Ship");
	private String transportType;

	private Transport(String transportType) {
		this.transportType = transportType;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	
}


