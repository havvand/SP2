package com.company;

public class ElectricCar extends ACar
{
    private int battCap;
    private int maxRange;

    public ElectricCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int battCap, int maxRange )
    {
        super(getRegistrationNumber, make, model, numberOfDoors);
        this.battCap = battCap;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh()
    {
        return battCap;
    }

    public int getMaxRangeKm()
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        return (battCap * 1000) / maxRange;
    }

    public String getFuelType()
    {
        return null;
    }

    @Override
    public int getRegistrationFee()
    {
        int kmPrL = (int) ((100.0 / (getWhPrKm() / 91.25))+0.05);

        if (kmPrL >= 20 && kmPrL <=50)
        {
            return 330;
        }
        if (kmPrL >= 15 && kmPrL <=20)
        {
            return 1050;
        }
        if (kmPrL >= 10 && kmPrL <=15)
        {
            return 2340;
        }
        if (kmPrL >= 5 && kmPrL <=10)
        {
            return 5500;
        }
        if (kmPrL < 5)
        {
            return 10470;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        String GUNDER = "\033[4;32m";
        String BOLDB = "\033[1;32m";
        String WHITEB = "\033[0;97m";
        String RESET = "\033[0m";
        return  GUNDER + BOLDB + "ELECTRIC\n" + RESET +
                BOLDB + "Make " + RESET + WHITEB + make + "\n" +
                BOLDB + "Model " + RESET + WHITEB + model + "\n" +
                BOLDB + "Wh/Km = " + RESET + WHITEB + getWhPrKm() +  "\n" +
                BOLDB + "Max Range = " + RESET + WHITEB + maxRange + " KM" + RESET +  "\n";
    }
}
