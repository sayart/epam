package com.gmail.slartua.tours.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gmail.slartua.tours.model.entity.*;
/**
 * Class Tours with fied list of tours <b>tours</b>
 * @author Artem Slobodyanyuk
 * @version 1.0
 *
 */
public class Tours<T extends Tour> {
	/** Field list of tours*/
	private ArrayList<T> tours;
	/** Getter of field */
	public ArrayList<T> getTours() {
		return tours;
	}
	public void setTours(ArrayList<T> tours) {
		this.tours = tours;
	}

	public ArrayList<T> sortToPrice(int toPrice){
		List<T> temp = new ArrayList<>();
		for (T tour : tours){
			if (tour.getPrice()<=toPrice) {
				temp.add(tour);
			}
		}
		Collections.sort(temp, new Comparator<T>() {


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
				return (tourOne.getPrice() > tourTwo.getPrice()) ? -1 : 1;
			}
			
		});
		return (ArrayList<T>)temp;
	}
	public ArrayList<T> getByType(int type){
		List<T> temp = new ArrayList<>();
		switch(type) {
		case 1: 
			for (T tour : tours) {
				if(tour instanceof HotTour) {
					temp.add(tour);
				}
			}
		case 2:
			for (T tour : tours) {
				if(tour instanceof HealthyTour) {
					temp.add(tour);
				}
			}
		case 3:
			for (T tour : tours) {
				if(tour instanceof Excursion) {
					temp.add(tour);
				}
			}
		case 4:
			for (T tour : tours) {
				if(tour instanceof Cruise) {
					temp.add(tour);
				}
			}
		}
		return (ArrayList<T>)temp;		
	}
	public ArrayList<T> getByTransportType(String transport){
		List<T> temp = new ArrayList<>();
		for (T tour : tours){
			if( tour.getTransport().equalsIgnoreCase(transport)) {
				temp.add(tour);
			}
		}
		return (ArrayList<T>)temp;
	}
	public ArrayList<T> getByDays(int days){
		List<T> temp = new ArrayList<>();
		for (T tour : tours){
			if ( tour.getDays() > days) {
				temp.add(tour);
			}
		}
		return (ArrayList<T>)temp;
	}
	
	
}
