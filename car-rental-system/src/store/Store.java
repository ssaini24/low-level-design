package store;

import location.Location;
import reservation.Reservation;
import reservation.ReservationStatus;
import user.UserPreferences;
import vehicle.Vehicle;
import vehicle.VehicleStatus;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    int id;
    Location location;
    VehicleInventoryManager inventoryManager;
    List<Reservation> reservations = new ArrayList<>();

    public Store(int id, Location location, VehicleInventoryManager inventoryManager) {
        this.id = id;
        this.location = location;
        this.inventoryManager = inventoryManager;
    }

    public Reservation createReservation(UserPreferences userPreferences){
        Vehicle vehicle = inventoryManager.getFreeVehicle(userPreferences.getVehicleType());
        if (Objects.isNull(vehicle)){
            return null;
        }

        int id = 1234;
        String fromDate = userPreferences.getFromDate();
        String tillDate = userPreferences.getTillDate();
        Location pickUpLocation = userPreferences.getLocation();
        Reservation reservation = new Reservation(id, fromDate, pickUpLocation, ReservationStatus.SCHEDULED, tillDate, vehicle);
        reservations.add(reservation);
        return reservation;
    }
}
