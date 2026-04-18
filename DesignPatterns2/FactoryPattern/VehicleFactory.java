package DesignPatterns2.FactoryPattern;

public class VehicleFactory {

    public Vehicle getVehicle(String brand) {
        if (brand == null) {
            return null;
        }

        switch (brand.toUpperCase()) {
            case "TOYOTA":
                return new Toyota();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }
}
