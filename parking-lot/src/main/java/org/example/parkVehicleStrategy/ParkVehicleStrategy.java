package org.example.parkVehicleStrategy;

import org.example.parkingSPOT.ParkingSpot;

import java.util.List;

public interface ParkVehicleStrategy {
    ParkingSpot findParking(List<ParkingSpot> parkingSpot);
}
