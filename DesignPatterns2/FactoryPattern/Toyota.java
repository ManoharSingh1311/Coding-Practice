package DesignPatterns2.FactoryPattern;

public class Toyota extends OrdinaryVehicle {

    @Override
    public void assemble() {
        System.out.println("Toyota assembled as an ordinary vehicle.");
    }
}
