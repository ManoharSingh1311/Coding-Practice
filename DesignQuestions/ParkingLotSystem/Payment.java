package DesignQuestions.ParkingLotSystem;

public class Payment {

    public double calculateFee(Ticket ticket) {
        long durationMillis = ticket.getExitTime() - ticket.getEntryTime();
        double hours = durationMillis / (1000.0 * 60 * 60);

        if (hours < 1) hours = 1; // minimum charge

        return hours * 20; // ₹20 per hour
    }
}