package DesignPatterns2.FactoryPattern;

public class OrdinaryVehicle implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("Ordinary vehicle assembled.");
    }
}
