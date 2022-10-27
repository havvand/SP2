package com.company;

public abstract class AFuelCar extends ACar
{
    private int kmPrLitre;

    public AFuelCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre ()
    {
        return this.kmPrLitre;
    }

    @Override
    public String toString()
    {
        String BOLDB = "\033[1;34m";
        String WHITEB = "\033[0;97m";
        String RESET = "\033[0m";
        return super.toString() + BOLDB +  "Km/l: " + RESET + WHITEB + this.kmPrLitre + RESET +"\n";
    }




}
