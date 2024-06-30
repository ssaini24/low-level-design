package store;

import vehicle.Vehicle;
import vehicle.VehicleStatus;
import vehicle.VehicleType;

import java.util.List;

public class VehicleInventoryManager {

    List<Vehicle> vehicleList;

    public VehicleInventoryManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle getFreeVehicle(VehicleType vehicleType){
        for (Vehicle vehicle: vehicleList){
            if (vehicle.getStatus() == VehicleStatus.FREE && vehicle.getType() == vehicleType){
                return vehicle;
            }
        }

        return null;
    }

    // CRUD for a vehicle
}
