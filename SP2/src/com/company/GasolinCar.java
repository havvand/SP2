package com.company;

public class GasolinCar extends AFuelCar
{

    public GasolinCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    public int getRegistrationFee()
    {
        if (getKmPrLitre () >= 20 && getKmPrLitre () <=50)
        {
            return 330;
        }
        if (getKmPrLitre () >= 15 && getKmPrLitre () <=20)
        {
            return 1050;
        }
        if (getKmPrLitre () >= 10 && getKmPrLitre () <=15)
        {
            return 2340;
        }
        if (getKmPrLitre () >= 5 && getKmPrLitre () <=10)
        {
           return 5500;
        }
        if (getKmPrLitre () < 5)
        {
            return 10470;
        }
        else
        return 0;
    }

    public String getFuelType()
    {
        return "Petrol";
    }

    @Override
    public String toString()
    {
        String BOLDB = "\033[1;34m";
        String WHITEB = "\033[0;97m";
        String RESET = "\033[0m";
        return super.toString() + BOLDB +"Fuel type: " + RESET + WHITEB + getFuelType() + RESET +  "\n";
    }
}
