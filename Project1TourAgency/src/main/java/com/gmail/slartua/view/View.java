package com.gmail.slartua.view;

import com.gmail.slartua.tours.model.entity.Tour;

import java.util.ArrayList;
import java.util.Iterator;

public class View implements ConstantsMessage, Menu {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printToursList(String message, ArrayList<Tour> toursList){
        System.out.println(message);
        for (Iterator<Tour> iterator = toursList.iterator(); iterator.hasNext();) {
            Tour tour = (Tour) iterator.next();
            if (tour != null) {
               System.out.println(tour.toString());
            } else {
                System.out.println(TOURS_NOT_FOUND);
            }
        }
    }

}
