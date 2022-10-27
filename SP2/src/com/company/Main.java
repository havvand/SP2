package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car dOne = new DiselCar("DC 010101 ", "Audi ", "A3 ", 2, 25, true);
        Car gOne = new GasolinCar("GC 010101 ", "BMW ", "320 ", 4, 15);
        Car eOne = new ElectricCar("EC 030303", "Mercedes", "EQC", 4, 100, 625);
        Car gTwo = new GasolinCar("GC 020202", "Mini", "Cooper", 2, 17);
        Car dTwo = new DiselCar("DC 020202", "VW", "Passat", 4, 18, false);

        FleetOfCars fleetOne = new FleetOfCars();

        fleetOne.addCar(gOne);
        fleetOne.addCar(dOne);
        fleetOne.addCar(eOne);
        fleetOne.addCar(gTwo);
        fleetOne.addCar(dTwo);

        System.out.println(fleetOne);
        System.out.println(fleetOne.getTotalRegFee());
    }
}
