package org.example;

import org.example.entrance.Entry;
import org.example.entrance.Exit;
import org.example.parkingSPOTManager.FourWParkingSpotManager;
import org.example.parkingSPOTManager.ParkingSpotManager;
import org.example.parkingSPOTManager.TwoWParkingSpotManager;
import org.example.vehicle.Ticket;
import org.example.vehicle.Vehicle;
import org.example.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        ParkingSpotManager twoWParkingSpotManager = TwoWParkingSpotManager.getInstance();
        twoWParkingSpotManager.addParkingSpot(6);

        ParkingSpotManager fourWParkingSpotManager  = FourWParkingSpotManager.getInstance();
        fourWParkingSpotManager.deleteParkingSpot(5);
        fourWParkingSpotManager.deleteParkingSpot(1);

        System.out.println("Two wheeler parking spots present: " +
                twoWParkingSpotManager.getTotalParkingSpots());
        System.out.println("Four wheeler parking spots present: " +
                fourWParkingSpotManager.getTotalParkingSpots());

        Entry entry = new Entry(Vehicle.builder().type(VehicleType.TWO_WHEELER).number("HP4422").build());
        Ticket generateTicket = entry.generateTicket();

        entry = new Entry(Vehicle.builder().type(VehicleType.TWO_WHEELER).number("HP4422").build());
        generateTicket = entry.generateTicket();

        System.out.println("Two wheeler parking spots present: " +
                twoWParkingSpotManager.getTotalParkingSpots());

        Vehicle fourW = Vehicle.builder().type(VehicleType.FOUR_WHEELER).number("HP2244").build();
        entry = new Entry(fourW);
        generateTicket = entry.generateTicket();

        System.out.println("Four wheeler parking spots present: " +
                fourWParkingSpotManager.getTotalParkingSpots());

        Exit exit = new Exit(fourW, generateTicket);
        int fare = exit.calculateFare();
        System.out.println("Exiting... Four Wheeler fare per min: " + fare);

        System.out.println("Four wheeler parking spots present: " +
                fourWParkingSpotManager.getTotalParkingSpots());
    }
}