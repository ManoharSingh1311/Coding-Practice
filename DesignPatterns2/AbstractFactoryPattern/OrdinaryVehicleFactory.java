package DesignPatterns2.AbstractFactoryPattern;

public class OrdinaryVehicleFactory implements OrdinaryVehicle {

    @Override
    public Vehicle createVehicle(String brand) {
        if (brand == null) {
            return null;
        }

        switch (brand.toUpperCase()) {
            case "TOYOTA":
                return new Toyota();
            case "HONDA":
                return new Honda();
            default:
                return null;
        }
    }
}
