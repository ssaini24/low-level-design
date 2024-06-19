package org.example.parkingSPOTManager;

import org.example.parkVehicleStrategy.NearElevator;
import org.example.parkingSPOT.ParkingSpot;
import org.example.parkingSPOT.TwoWParkingSpot;
import org.example.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class TwoWParkingSpotManager extends ParkingSpotManager {
    private static List<ParkingSpot> parkingSpots;
    private static TwoWParkingSpotManager instance;

    private TwoWParkingSpotManager() {
        super(getParkingSpots(), new NearElevator(getParkingSpots()), VehicleType.TWO_WHEELER);
    }

    public static TwoWParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new TwoWParkingSpotManager();
        }

        return instance;
    }

    private static List<ParkingSpot> getParkingSpots() {
        if (parkingSpots == null) {
            parkingSpots = initParkingSpots();
        }

        return parkingSpots;
    }

    private static List<ParkingSpot> initParkingSpots() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            ParkingSpot parkingSpot = new TwoWParkingSpot(i, true, VehicleType.TWO_WHEELER, "");
            parkingSpots.add(parkingSpot);
        }

        return parkingSpots;
    }
}
