package DesignQuestions.ParkingLotSystem;

import java.util.*;

public class ParkingLot {
    private List<Floor> floors;

    public ParkingLot(List<Floor> floors) {
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle v) {
        for (Floor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(v);
            if (spot != null) {
                spot.parkVehicle(v);
                System.out.println("Parked at Floor: " + floor.getFloorNumber() + ", Spot: " + spot.getId());
                return new Ticket(UUID.randomUUID().toString(), v, spot);
            }
        }
        System.out.println("Parking Full!");
        return null;
    }

    public void unparkVehicle(Ticket ticket) {
        ticket.getSpot().removeVehicle();
        ticket.closeTicket();
        System.out.println("Vehicle removed from Spot: " + ticket.getSpot().getId());
    }
}