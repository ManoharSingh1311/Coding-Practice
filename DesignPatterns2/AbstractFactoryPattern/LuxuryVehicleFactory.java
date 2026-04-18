package DesignPatterns2.AbstractFactoryPattern;

public class LuxuryVehicleFactory implements LuxuryVehicle {

    @Override
    public Vehicle createVehicle(String brand) {
        if (brand == null) {
            return null;
        }

        switch (brand.toUpperCase()) {
            case "BMW":
                return new BMW();
            case "MERCEDES":
                return new Mercedes();
            default:
                return null;
        }
    }
}
