package org.example.parkingSPOT;


import org.example.vehicle.VehicleType;

public class TwoWParkingSpot extends ParkingSpot {
    public TwoWParkingSpot(Integer id, Boolean isEmpty, VehicleType type, String VehicleNo) {
        super(id, isEmpty, type, VehicleNo);
    }

    @Override
    public int price() {
        return 10;
    }
}
