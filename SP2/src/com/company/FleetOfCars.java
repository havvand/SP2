package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FleetOfCars
{
    // Declare an ArrayList that contains Car objects - useing the interface, which is the most abstract representation of the class Car.
    static ArrayList<Car> cars;

    public FleetOfCars()
    {
        // Initializing the cars ArrayList.
         cars = new ArrayList<>();
    }

    public int getTotalRegFee()
    {
        int totRegFee = 0;

        for (Car car: cars)
        {
            totRegFee += car.getRegistrationFee();
        }
        String YELLOW = "\033[1;91m";
        String RESET = "\033[0m";
        System.out.print(YELLOW + "Total registration-fee for fleet: " + RESET);

        return totRegFee;
    }

    public void addCar (Car car)
    {
        // Method to add cars to ArrayList.
        cars.add(car);
        //System.out.println("Fra ARRAY " + car);

    }

    @Override
    public String toString()
    {
        String YELLOW = "\033[1;33m";
        String RESET = "\033[0m";

        StringBuilder res = new StringBuilder();
        res.append( "\n" + YELLOW + "----|Fleet of cars|----\n");
        //res.append("-------|||-------- \n" + RESET);
        for (Car car : cars)
        {
            res.append(car.toString());
            res.append(YELLOW + "-------|--|-------- \n" + RESET);
        }

       //String listOfCars = Arrays.toString(cars.toArray()).replace("[", "").replace("]", "");
       //listOfCars.split(" , ");
       return res.toString();
    }
}
