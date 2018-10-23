package com.gmail.slartua.shop.controller;

import com.gmail.slartua.shop.model.DeviceStore;
import com.gmail.slartua.shop.view.InputUtility;
import com.gmail.slartua.shop.view.View;

public class Controller {
	private DeviceStore model = new DeviceStore();
	private View view = new View();

	public void run() {
		model.setName(InputUtility.inputDeviceStoreName(view));
//		System.out.println(model.getName());
		addDepartments();
		view.showStore("Sort by department name", 
				model.sortByDepartmentName());
		view.printMessage("Searching", 
				model.findDepartmentByDevice(InputUtility.findDevice(view)));
	}

	private void addDepartments() {
		int numberOfDepartments = InputUtility.inputNumberOfDepartments(view);
		for (int i = 0; i < numberOfDepartments; i++) {
			model.add(model.new Department(InputUtility.inputDepartmentName(view), InputUtility.inputDevices(view)));
		}
	}

}
