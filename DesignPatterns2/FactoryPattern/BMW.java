package DesignPatterns2.FactoryPattern;

public class BMW extends LuxuryVehicle {

    @Override
    public void assemble() {
        System.out.println("BMW assembled as a luxury vehicle.");
    }
}
