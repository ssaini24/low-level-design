package reservation;

import location.Location;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class Reservation {
    int id;
    Vehicle vehicle;
    String fromDate;
    String tillDate;
    Location pickUpLocation;
    ReservationStatus status;

    public Reservation(int id, String fromDate, Location pickUpLocation, ReservationStatus status, String tillDate, Vehicle vehicle) {
        this.fromDate = fromDate;
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.status = status;
        this.tillDate = tillDate;
        this.vehicle = vehicle;
    }
}
