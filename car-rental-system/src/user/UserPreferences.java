package user;

import location.Location;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class UserPreferences {

    String fromDate;
    String tillDate;
    VehicleType vehicleType;
    Location location;

    public UserPreferences(String fromDate, String tillDate, VehicleType vehicleType, Location location) {
        this.fromDate = fromDate;
        this.tillDate = tillDate;
        this.vehicleType = vehicleType;
        this.location = location;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getTillDate() {
        return tillDate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Location getLocation() {
        return location;
    }
}
