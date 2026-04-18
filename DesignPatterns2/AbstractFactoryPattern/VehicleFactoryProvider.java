package DesignPatterns2.AbstractFactoryPattern;

public class VehicleFactoryProvider {

    public static OrdinaryVehicle getOrdinaryFactory() {
        return new OrdinaryVehicleFactory();
    }

    public static LuxuryVehicle getLuxuryFactory() {
        return new LuxuryVehicleFactory();
    }
}
