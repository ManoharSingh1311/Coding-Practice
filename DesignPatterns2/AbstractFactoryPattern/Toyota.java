package DesignPatterns2.AbstractFactoryPattern;

public class Toyota implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("Toyota assembled as an ordinary vehicle.");
    }
}
