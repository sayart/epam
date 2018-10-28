package com.gmail.slartua.tours.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gmail.slartua.tours.model.entity.*;
/**
 * Class Tours with field list of tours <b>tours</b>
 * @author Artem Slobodyanyuk
 * @version 1.0
 *
 */
public class Tours<T extends Tour> {
	/** Field list of tours*/
	private ArrayList<T> tours;

    /**
     * Getter of field {@link #tours}
     * @return = return list of tours
     */
	public ArrayList<T> getTours() {
		return tours;
	}

    /**
     * Set the field {@link #tours}
     * @param tours - list of tours
     */
	public void setTours(ArrayList<T> tours) {
		this.tours = tours;
	}

    /**
     * Sort current list of tours from toPrice to 0
     * @param toPrice - max value to sort list
     * @return - return sort list of tours from toPrice to zero
     */
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

    /**
     * Sort list by instances of ones child of Tour
     * @param type - four cases of tours: case 1 - HotTour, case 2 - HealthyTour, case 3 - Excursion,
     *             case 4 - Cruise
     * @return list of one instance
     */
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

    /**
     * Get list of tours by type of transport
     * @param transport - transport
     * @return -list of tours by type of transport
     */
	public ArrayList<T> getByTransportType(String transport){
		List<T> temp = new ArrayList<>();
		for (T tour : tours){
			if( tour.getTransport().equalsIgnoreCase(transport)) {
				temp.add(tour);
			}
		}
		return (ArrayList<T>)temp;
	}

    /**
     * Get list of tours >=days
     * @param days min value of days to sort
     * @return list of tours >=days
     */
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
