package com.gmail.slartua.tours.model.entity;

public class Cruise extends Tour {
	public String linerName;
	public String port;
	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cruise(double price, int days, String country, boolean allInclusive, String linerName, String port) {
		super(price, days, country, allInclusive, Transport.SHIP.getTransportType());
		this.linerName = linerName;
		this.port = port;
	}
	public String getLinerName() {
		return linerName;
	}
	public void setLinerName(String linerName) {
		this.linerName = linerName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return super.toString()+
				" linerName='" + linerName + '\'' +
				", port='" + port + '\'' +
				'}';
	}
}
