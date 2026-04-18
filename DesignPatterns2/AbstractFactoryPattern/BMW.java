package DesignPatterns2.AbstractFactoryPattern;

public class BMW implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("BMW assembled as a luxury vehicle.");
    }
}
