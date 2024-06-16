package org.example.vehicle;

import lombok.Builder;
import lombok.Data;
import org.example.parkingSPOT.ParkingSpot;
import org.example.vehicle.VehicleType;

import java.time.Instant;

@Data
@Builder
public class Ticket {
    private Instant entryTime;
    private ParkingSpot parkingSpot;
    private VehicleType vehicleType;
}
