package org.example.parkingSPOTManager;

import org.example.parkVehicleStrategy.NearElevator;
import org.example.vehicle.VehicleType;

import java.util.ArrayList;

public class ParkingSpotFactory {
    public ParkingSpotManager getParkingManager(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER:
                return TwoWParkingSpotManager.getInstance();
            case FOUR_WHEELER:
                return FourWParkingSpotManager.getInstance();
            default:
                return null;
        }
    }
}
