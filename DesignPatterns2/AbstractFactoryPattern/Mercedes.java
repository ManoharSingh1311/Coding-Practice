package DesignPatterns2.AbstractFactoryPattern;

public class Mercedes implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("Mercedes assembled as a luxury vehicle.");
    }
}
