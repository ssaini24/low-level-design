package org.example.parkVehicleStrategy;

import org.example.parkingSPOT.ParkingSpot;

import java.util.List;

public class NearElevator implements ParkVehicleStrategy {
    @Override
    public ParkingSpot findParking(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot spot: parkingSpots){
            if (spot.getIsEmpty()){
                return spot;
            }
        }

        return null;
    }
}
