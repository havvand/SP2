package com.company;

public abstract class ACar implements Car
{
    String getRegistrationNumber;
    final String make;
    final String model;
    final int numberOfDoors;

    public ACar (String getRegistrationNumber, String make, String model, int numberOfDoors)
    {
        this.getRegistrationNumber = getRegistrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    public String getRegistrationNumber()
    {
        return this.getRegistrationNumber;
    }

    public String getMake()
    {
        return this.make;
    }

    public String getModel()
    {
        return this.model;
    }

    public int getNumberOfDoors()
    {
        return this.numberOfDoors;
    }

    @Override
    public String toString()
    {
        String BOLDB = "\033[1;34m";
        String WHITEB = "\033[0;97m";
        String RESET = "\033[0m";
        return BOLDB + "Make: " + RESET + WHITEB + make  + "\n" + BOLDB + "Model: " + RESET + WHITEB + model + RESET + "\n";
    }
}
