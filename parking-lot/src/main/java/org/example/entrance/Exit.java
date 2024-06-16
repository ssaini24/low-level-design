package org.example.entrance;

import org.example.parkingSPOT.ParkingSpot;
import org.example.parkingSPOTManager.ParkingSpotFactory;
import org.example.parkingSPOTManager.ParkingSpotManager;
import org.example.vehicle.Ticket;
import org.example.vehicle.Vehicle;

import java.time.Duration;
import java.time.Instant;

public class Exit {
    public void unReserveParkingSpot(Vehicle vehicle, Ticket ticket){
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        ParkingSpotManager parkingSpotManager = parkingSpotFactory.getParkingManager(vehicle.getType());
        parkingSpotManager.unParkVehicle(ticket, vehicle);
    }

    public int calculateFare(Vehicle vehicle, Ticket ticket){
        unReserveParkingSpot(vehicle, ticket);
        long duration = Duration.between(ticket.getEntryTime(), Instant.now()).toMinutes();
        return (int) duration * 2;
    }
}
