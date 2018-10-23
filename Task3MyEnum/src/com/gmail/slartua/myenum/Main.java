package com.gmail.slartua.myenum;

public class Main {

	public static void main(String[] args) {
		System.out.println(Colors.RED.name() + " " +
				Colors.RED.ordinal());
		System.out.println(Colors.GREEN.toString());
		System.out.println(Colors.RED.equals(Colors.ORANGE));
		System.out.println(Colors.valueOf("RED").toString());
	}

}
