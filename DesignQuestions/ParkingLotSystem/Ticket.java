package DesignQuestions.ParkingLotSystem;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private long entryTime;
    private long exitTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = System.currentTimeMillis();
    }

    public void closeTicket() {
        this.exitTime = System.currentTimeMillis();
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public long getExitTime() {
        return exitTime;
    }

    public String getTicketId() {
        return ticketId;
    }
}