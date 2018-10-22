package com.gmail.slartua.shop.model;

import java.util.Arrays;
import java.util.Comparator;

public class DeviceStore {
	private String name;
	private Department[] departments = new Department[1];

	public DeviceStore() {
		super();
	}

	public DeviceStore(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Department {
		private String departmentName;
		private String[] devices;
		private int rawInStore;

		{
			DeviceStore.this.add(this);
			rawInStore = departments.length;
		}

		public Department() {
			super();
		}

		public Department(String departmentName, String[] devices) {
			super();
			this.departmentName = departmentName;
			this.devices = devices;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public String[] getDevices() {
			return devices;
		}

		public void setDevices(String[] devices) {
			this.devices = devices;
		}

		public int getRawInStore() {
			return rawInStore;
		}

		public void setRawInStore(int rawInStore) {
			this.rawInStore = rawInStore;
		}

		public boolean findDevice(String str) {
			for (String device : devices) {
				if (device.equalsIgnoreCase(str)) {
					return true;
				}
			}
			return false;
		}

		@Override
		public String toString() {
			return "Department [departmentName=" + departmentName + ", devices=" + Arrays.toString(devices)
					+ ", rawInStore=" + rawInStore + "]";
		}
		
	}

	public void add(Department addingDepartment) {
		for (Department department : departments) {
			if (department == null) {
				department = addingDepartment;
			} else {
				this.resize();
				departments[departments.length] = addingDepartment;
				return;
			}
		}
	}

	private void resize() {
		Department[] temp = new Department[this.departments.length + 1];
		System.arraycopy(departments, 0, temp, 0, departments.length);
		departments = temp;
	}

	public Department[] sortByDepartmentName() {
		Department[] temp = new Department[departments.length];
		int count = 0;
		for (Department department : temp) {
			temp[count++] = department;
		}
		Arrays.sort(temp, new Comparator<Department>() {
			@Override
			public int compare(Department a, Department b) {
				return (a.getDepartmentName().compareToIgnoreCase(b.getDepartmentName()));
			}
		});
		return Arrays.copyOf(temp, count);
	}

	public String findDepartmentByDevice(String device) {
		for (Department department : departments) {
			if (department.findDevice(device)) {
				return department.getClass().getSimpleName();
			}
		}
		return "No such device in the store";
	}

}
