package com.company;

public class DiselCar extends AFuelCar
{
    boolean particleFilter;
    int particleFee;

    public DiselCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(getRegistrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
        this.particleFee = hasParticleFilter();
    }


   public int hasParticleFilter() {
       if (!particleFilter) {
           return 1000;
       } else {
           return 0;
       }
   }


   public int getRegistrationFee()
   {
       if (getKmPrLitre () >= 20 && getKmPrLitre () <=50)
       {
           return 330+130+particleFee;
       }
       if (getKmPrLitre () >= 15 && getKmPrLitre () <=20)
       {
           return 1050+1390+particleFee;
       }
       if (getKmPrLitre () >= 10 && getKmPrLitre () <=15)
       {
           return 2340+1850+particleFee;
       }
       if (getKmPrLitre () >= 5 && getKmPrLitre () <=10)
       {
           return 5500+2770+particleFee;
       }
       if (getKmPrLitre () < 5)
       {
           return 10470+15260+particleFee;
       }
       else
           return 0;
   }

    public String getFuelType()
    {
        return "Diesel";
    }

   @Override
   public String toString()
   {
       String BOLDB = "\033[1;34m";
       String WHITEB = "\033[0;97m";
       String RESET = "\033[0m";
       return super.toString() + BOLDB + "Fuel type: " + RESET + WHITEB +  getFuelType() +  "\n" + BOLDB +"Has particle filter: " + RESET + WHITEB + particleFilter + RESET + "\n";
   }
}
