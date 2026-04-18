package DesignPatterns2.FactoryPattern;

public class VehicleFactoryMain {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle toyota = vehicleFactory.getVehicle("TOYOTA");
        Vehicle bmw = vehicleFactory.getVehicle("BMW");

        if (toyota != null) {
            toyota.assemble();
        }
        if (bmw != null) {
            bmw.assemble();
        }
    }
}
