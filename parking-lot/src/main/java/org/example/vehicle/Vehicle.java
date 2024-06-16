package org.example.vehicle;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Vehicle {
    private String number;
    private VehicleType type;
}
