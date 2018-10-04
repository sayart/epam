package com.gmail.slartua;

public class PerfectNumberModel {
	private int value;

	public PerfectNumberModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PerfectNumberModel(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	private boolean isPerfectNumber(int number) {
		int sum = 0;
		for(int i = 1; i <= number/2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
	public int findFirstPerfectNumber() {
		int i = 1;
		while(true) {
			if(isPerfectNumber(i)) {
				return i;
			}
			i++;
		}
	}
	public String getAllPerfectNumbers() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= this.value; i++) {
			if(isPerfectNumber(i)) {
				sb.append(i + " ");
			}
		}
		return sb.toString();
	}
	
}
