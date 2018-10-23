package com.gmail.slartua.myenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyEnum <T> implements Comparable<T> {
	private final String name;
	private final int ordinal;
	private final T[] arguments;
	public static int elementCount = -1;
	private static List<MyEnum<?>> enums = new ArrayList<>();
	
	public MyEnum() {
		name = null;
		arguments = null;
		ordinal = -1;
	}
		
	public MyEnum(String name,  T ... arguments) {
		super();
		elementCount++;
		this.name = name;
		this.arguments = arguments;
		ordinal = elementCount;
		enums.add(this);		
	}

	public final String name() {
		return name;
	}
	public final int ordinal() {
		return ordinal;
	}
	
	@Override
	public String toString() {
		return "MyEnum [name=" + name + 
				", ordinal=" + ordinal + 
				", arguments=" + Arrays.toString(arguments) + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arguments);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEnum<?> other = (MyEnum<?>) obj;
		if (!Arrays.equals(arguments, other.arguments))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static MyEnum<?> valueOf(String enumName) {
		for (MyEnum<?> myEnum : enums) {
			if(myEnum.name().equals(enumName))
				return myEnum;
		}
		return null;
	}

	@Override
	public final int compareTo(T o) {
		MyEnum<?> other = (MyEnum<?>) o;
		return this.ordinal - other.ordinal;
	}
}
	
	
