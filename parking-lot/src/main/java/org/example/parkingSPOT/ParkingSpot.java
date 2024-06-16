package org.example.parkingSPOT;

import lombok.*;
import org.example.vehicle.VehicleType;

@Data
@Builder
public class ParkingSpot {

    private Integer id;
    private Boolean isEmpty;
    private VehicleType type;
    private String VehicleNo;

    public ParkingSpot(Integer id, Boolean isEmpty, VehicleType type, String VehicleNo) {
        this.setId(id);
        this.setIsEmpty(isEmpty);
        this.setType(type);
        this.setVehicleNo(VehicleNo);
    }

    public int price() {
        return 0;
    }
}
