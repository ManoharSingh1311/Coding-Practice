package DesignPatterns2.AbstractFactoryPattern;

public class Honda implements Vehicle {

    @Override
    public void assemble() {
        System.out.println("Honda assembled as an ordinary vehicle.");
    }
}
