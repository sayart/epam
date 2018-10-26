package com.gmail.slartua.tours.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.gmail.slartua.tours.model.entity.*;

public class Tours<T extends Tour> {
	private ArrayList<T> tours;
	public ArrayList<T> getTours() {
		return tours;
	}

	public void setTours(ArrayList<T> tours) {
		this.tours = tours;
	}
	public ArrayList<T> sortToPrice(int toPrice){
		List<T> temp = new ArrayList<T>();
		for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			if (t.getPrice()<=toPrice) {
				temp.add(t);
			}
		}
		Collections.sort(temp, new Comparator<T>() {

			@Override
			public int compare(T tourOne, T tourTwo) {
				if (tourOne != null && tourTwo == null) {
					return 1;
				}
				if (tourOne == null && tourTwo != null) {
					return -1;
				}
				if (tourOne == null && tourTwo == null) {
					return 0;
				}
				return (tourOne.getPrice() > tourTwo.getPrice()) ? 1 : -1;
			}
			
		});
		return (ArrayList<T>)temp;
	}
	public ArrayList<T> getByType(int type){
		List<T> temp = new ArrayList<>();
		switch(type) {
		case 1: 
			for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				if(t instanceof HotTour) {
					temp.add(t);
				}
			}
		case 2: 
			for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				if(t instanceof HealthyTour) {
					temp.add(t);
				}
			}
		case 3: 
			for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				if(t instanceof HotTour) {
					temp.add(t);
				}
			}
		case 4: 
			for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				if(t instanceof HotTour) {
					temp.add(t);
				}
			}
		}
		return (ArrayList<T>)temp;		
	}
	public ArrayList<T> getByTransportType(Transport transport){
		List<T> temp = new ArrayList<>();
		for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			if( t.getTransport().equals(transport.getTransportType())) {
				temp.add(t);
			}
		}
		return (ArrayList<T>)temp;
	}
	public ArrayList<T> getByDays(int days){
		List<T> temp = new ArrayList<>();
		for (Iterator<T> iterator = temp.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			if ( t.getDays() > days) {
				temp.add(t);
			}
		}
		return (ArrayList<T>)temp;
	}
	
	
}
