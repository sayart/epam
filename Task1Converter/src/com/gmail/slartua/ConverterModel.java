package com.gmail.slartua;

public class ConverterModel {
	private int decNumber;

	public ConverterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConverterModel(int decNumber) {
		super();
		this.decNumber = decNumber;
	}

	public int getDecNumber() {
		return decNumber;
	}

	public void setDecNumber(int decNumber) {
		this.decNumber = decNumber;
	}

	public String convertToBin() {
		int b;
		int i = this.decNumber;
		StringBuilder sb = new StringBuilder();
		while (i != 0) {
			b = i % 2;
			sb.append(b);
			i /= 2;
		}
		sb.reverse();
		return sb.toString();
	}

	public String convertToOct() {
		int b;
		int i = this.decNumber;
		StringBuilder sb = new StringBuilder();
		while (i != 0) {
			b = i % 8;
			sb.append(b);
			i /= 8;
		}
		sb.reverse();
		return sb.toString();
	}

	public String convertToHex() {
		int b;
		int i = this.decNumber;
		StringBuilder sb = new StringBuilder();
		while (i != 0) {
			b = i % 16;
			switch (b) {
			case 10:
				sb.append('A');
				break;
			case 11:
				sb.append('B');
				break;
			case 12:
				sb.append('C');
				break;
			case 13:
				sb.append('D');
				break;
			case 14:
				sb.append('E');
				break;
			case 15:
				sb.append('F');
				break;
			default:
				sb.append(b);
			}
			i /= 16;
		}
		sb.reverse();
		return sb.toString();
	}

	@Override
	public String toString() {
		return "" + this.decNumber + "";
	}
}
