package com.gmail.slartua.data;

import com.gmail.slartua.tours.model.entity.*;

import java.util.ArrayList;

public class DataTours {
    public static ArrayList<Tour> getTours(){
        return new ArrayList<Tour>(){/**
         *
         */
            private static final long serialVersionUID = 1L;
            {
                add(new HotTour(3000.0, 5, "Ukraine", true, "Bus", 10));
                add(new HealthyTour(1000.0, 2, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new HotTour(3000.0, 5, "Ukraine", true, "Bus", 10));
                add(new HealthyTour(4000.0, 10, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new HealthyTour(30000.0, 3, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new HealthyTour(12000.0, 21, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new HealthyTour(4000.0, 4, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new HealthyTour(2000.0, 4, "Slovakia" , true, "Airplane", "Massage", true, true));
                add(new Cruise(300, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new HotTour(23000.0, 5, "Ukraine", true, "Bus", 10));
                add(new HotTour(200042.0, 2, "Ukraine", true, "Bus", 10));
                add(new HotTour(202300.0, 5, "Ukraine", true, "Bus", 10));
                add(new Excursion(12000, 1, "Ukraine", false, "Bus", "Bukovel", true));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new HotTour(20300.0, 5, "Ukraine", true, "Bus", 10));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(15200, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(15020, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new HotTour(20030.0, 15, "Ukraine", true, "Bus", 10));
                add(new HotTour(20300.0, 25, "Ukraine", true, "Bus", 10));
                add(new HotTour(10200.0, 5, "Ukraine", true, "Bus", 10));
                add(new HotTour(23000.0, 15, "Ukraine", true, "Bus", 10));
                add(new HotTour(30100.0, 5, "Ukraine", true, "Bus", 10));
                add(new Excursion(1300, 2, "Ukraine", false, "Bus", "Bukovel", true));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new HotTour(2000.0, 5, "Ukraine", true, "Bus", 10));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new Cruise(1500, 14, "Ukraine", true, "Sea", "Odessa"));
                add(new HotTour(2000.0, 5, "Ukraine", true, "Bus", 10));
                add(new HotTour(2000.0, 5, "Ukraine", true, "Bus", 10));

        }};
    }
}
