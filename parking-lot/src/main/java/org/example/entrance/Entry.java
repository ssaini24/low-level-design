package org.example.entrance;

import org.example.parkingSPOT.ParkingSpot;
import org.example.parkingSPOTManager.ParkingSpotFactory;
import org.example.parkingSPOTManager.ParkingSpotManager;
import org.example.vehicle.Ticket;
import org.example.vehicle.Vehicle;

import java.time.Instant;

public class Entry {
    private ParkingSpot parkingSpot;

    Vehicle vehicle;

    public Entry(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void reserveParkingSpot(){
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        ParkingSpotManager parkingSpotManager = parkingSpotFactory.getParkingManager(vehicle.getType());
        parkingSpot = parkingSpotManager.parkVehicle(vehicle);
    }

    public Ticket generateTicket(){
        reserveParkingSpot();
        return Ticket.builder().entryTime(Instant.now()).parkingSpot(parkingSpot).vehicleType(vehicle.getType()).build();
    }
}
