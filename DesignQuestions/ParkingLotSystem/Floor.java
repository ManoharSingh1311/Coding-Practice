package DesignQuestions.ParkingLotSystem;

import java.util.*;

public class Floor {
    
    private int floorNumber;
    private List<ParkingSpot> spots;

    public Floor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    public ParkingSpot findAvailableSpot(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(v)) {
                return spot;
            }
        }
        return null;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}