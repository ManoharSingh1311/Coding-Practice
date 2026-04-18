package DesignQuestions.ParkingLotSystem;

import DesignQuestions.ParkingLotSystem.enums.VehicleType;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create parking spots
        List<ParkingSpot> floor1Spots = Arrays.asList(
                new ParkingSpot(1, VehicleType.CAR),
                new ParkingSpot(2, VehicleType.BIKE),
                new ParkingSpot(3, VehicleType.TRUCK)
        );

        List<ParkingSpot> floor2Spots = Arrays.asList(
                new ParkingSpot(4, VehicleType.CAR),
                new ParkingSpot(5, VehicleType.BIKE)
        );

        // Create floors
        Floor floor1 = new Floor(1, floor1Spots);
        Floor floor2 = new Floor(2, floor2Spots);

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot(Arrays.asList(floor1, floor2));

        // Create vehicles
        Vehicle car = new Vehicle("MH12AB1234", VehicleType.CAR);
        Vehicle bike = new Vehicle("MH12XY5678", VehicleType.BIKE);

        // Park vehicles
        Ticket t1 = parkingLot.parkVehicle(car);
        Ticket t2 = parkingLot.parkVehicle(bike);

        // Simulate exit
        try { Thread.sleep(2000); } catch (Exception e) {}

        parkingLot.unparkVehicle(t1);

        // Payment
        Payment payment = new Payment();
        double fee = payment.calculateFee(t1);

        System.out.println("Ticket ID: " + t1.getTicketId());
        System.out.println("Parking Fee: ₹" + fee);
    }
}