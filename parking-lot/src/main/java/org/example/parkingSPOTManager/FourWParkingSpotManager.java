package org.example.parkingSPOTManager;

import org.example.parkVehicleStrategy.NearElevator;
import org.example.parkingSPOT.ParkingSpot;
import org.example.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class FourWParkingSpotManager extends ParkingSpotManager {
    private static List<ParkingSpot> parkingSpots;

    private static FourWParkingSpotManager instance;

    private FourWParkingSpotManager() {
        super(getParkingSpots(), new NearElevator(), VehicleType.FOUR_WHEELER);
    }

    public static FourWParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new FourWParkingSpotManager();
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
            ParkingSpot parkingSpot = new ParkingSpot(i, true, VehicleType.FOUR_WHEELER, "");
            parkingSpots.add(parkingSpot);
        }
        return parkingSpots;
    }

    public void updateParkingSpots(List<ParkingSpot> updatedParkingSpots) {
        parkingSpots = updatedParkingSpots;
    }
}
