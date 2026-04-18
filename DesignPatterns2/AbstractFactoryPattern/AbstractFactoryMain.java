package DesignPatterns2.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        OrdinaryVehicle ordinaryFactory = VehicleFactoryProvider.getOrdinaryFactory();
        LuxuryVehicle luxuryFactory = VehicleFactoryProvider.getLuxuryFactory();

        Vehicle toyota = ordinaryFactory.createVehicle("TOYOTA");
        Vehicle bmw = luxuryFactory.createVehicle("BMW");

        if (toyota != null) {
            toyota.assemble();
        }
        if (bmw != null) {
            bmw.assemble();
        }
    }
}
