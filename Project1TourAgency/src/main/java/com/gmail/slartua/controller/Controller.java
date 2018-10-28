package com.gmail.slartua.controller;

import com.gmail.slartua.data.DataTours;
import com.gmail.slartua.tours.model.Tours;
import com.gmail.slartua.tours.model.entity.Tour;
import com.gmail.slartua.view.InputUtility;
import com.gmail.slartua.view.View;

import java.util.ArrayList;

public class Controller {
    private Tours<Tour> model = new Tours<>();
    private View view = new View();

    public void run(){
        model.setTours(DataTours.getTours());
        view.printMessage("Welcome! Please input search parameters for your tour.");
        view.printToursList("Result search:\n", searchByParameters());
    }

    private ArrayList<Tour> searchByParameters(){
       Tours<Tour> temp = new Tours<>();
       temp.setTours(model.getTours());
       temp.setTours(temp.getByType(InputUtility.inputMenu(view)));
       temp.setTours(temp.getByTransportType(InputUtility.inputTransport(view)));
       temp.setTours(temp.getByDays(InputUtility.inputMinimumDays(view)));
       temp.setTours(temp.sortToPrice(InputUtility.inputPriceToSort(view)));
       return temp.getTours();
    }

}
