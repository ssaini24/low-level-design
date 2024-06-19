package org.example.parkVehicleStrategy;

import org.example.parkingSPOT.ParkingSpot;

import java.util.List;

public class NearElevator implements ParkVehicleStrategy {

    List<ParkingSpot> parkingSpots;

    public NearElevator(List<ParkingSpot> parkingSpots){
        this.parkingSpots = parkingSpots;
    }

    @Override
    public ParkingSpot findParking() {
        for (ParkingSpot spot: parkingSpots){
            if (spot.getIsEmpty()){
                return spot;
            }
        }

        return null;
    }
}
