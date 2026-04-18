package DesignQuestions.ParkingLotSystem;

import DesignQuestions.ParkingLotSystem.enums.VehicleType;

public class ParkingSpot {
    private int id;
    private VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle v) {
        return !isOccupied && this.type == v.getType();
    }

    public void parkVehicle(Vehicle v) {
        this.vehicle = v;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getId() {
        return id;
    }
}