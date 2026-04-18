package DesignPatterns2.FactoryPattern;

public class LuxuryVehicle implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("Luxury vehicle assembled.");
    }
}
