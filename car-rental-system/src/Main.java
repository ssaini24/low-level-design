import bill.Bill;
import location.Location;
import payment.Payment;
import reservation.Reservation;
import store.Store;
import store.VehicleInventoryManager;
import user.User;
import user.UserPreferences;
import vehicle.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    private static Store store;
    private static User user;
    private static UserPreferences userPreferences;
    private static Location userLocation;

    public static void main(String[] args) {
        init();
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(Arrays.asList(store), Arrays.asList(user));
        Store locatedStore = rentalSystem.locateStore(userLocation);
        Reservation reservation = locatedStore.createReservation(userPreferences);
        if (Objects.isNull(reservation)){
            System.out.println("No free vehicle present");
            return;
        }

        Bill bill = new Bill(reservation);
        Payment payment = new Payment(bill);
        String isPaid = payment.pay();

        System.out.println(isPaid + ": " +  bill.isBillPaid());
    }

    private static void init(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("V12", "4422", VehicleStatus.FREE));
        vehicleList.add(new Car("V13", "2244", VehicleStatus.FREE));
        store = new Store(12, new Location("Missouri", "SpringField"), new VehicleInventoryManager(vehicleList));
        user = new User("U12", "dickie");
        userPreferences = new UserPreferences("2023-07-01", "2024-07-10", VehicleType.CAR, userLocation);
        userLocation = new Location("Missouri", "SpringField");
    }
}