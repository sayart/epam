package com.gmail.slartua.shop.view;

import com.gmail.slartua.shop.model.DeviceStore.Department;

public class View implements UserInterface {
		
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printMessage(String message, String result) {
		System.out.println(message);
		System.out.println(result);
	}
	
	public void showStore(String message, Department[] departments) {
		System.out.println(message);
		for (Department department : departments) {
			if(department != null) {
				department.toString();
			}
			
		}
	}
	
	
}
