package org.example.parkingSPOTManager;

import org.example.parkVehicleStrategy.ParkVehicleStrategy;
import org.example.parkingSPOT.ParkingSpot;
import org.example.vehicle.Ticket;
import org.example.vehicle.Vehicle;
import org.example.vehicle.VehicleType;

import java.util.List;
import java.util.Objects;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpotList;
    ParkVehicleStrategy parkVehicleStrategy;

    VehicleType vehicleType;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkVehicleStrategy parkVehicleStrategy, VehicleType v){
        this.parkingSpotList = parkingSpots;
        this.parkVehicleStrategy = parkVehicleStrategy;
        this.vehicleType = v;
    }

    public void addParkingSpot(int id){
        ParkingSpot parkingSpot = new ParkingSpot(id, true, vehicleType, "");
        parkingSpotList.add(parkingSpot);
    }

    public long getTotalParkingSpots(){
        return parkingSpotList.stream().filter(ParkingSpot::getIsEmpty).count();
    }

    public void deleteParkingSpot(int id){
        ParkingSpot parkingSpot = new ParkingSpot(id, true, vehicleType, "");
        parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = parkVehicleStrategy.findParking();
        if (Objects.nonNull(parkingSpot)){
            parkingSpotList.remove(parkingSpot);

            ParkingSpot updatedParkingSpot = ParkingSpot.builder().build();
            updatedParkingSpot.setId(parkingSpot.getId());
            updatedParkingSpot.setVehicleNo(vehicle.getNumber());
            updatedParkingSpot.setIsEmpty(false);
            updatedParkingSpot.setType(vehicle.getType());

            parkingSpotList.add(updatedParkingSpot);

            System.out.println("Vehicle is parked at spot #" + parkingSpot.getId());
            return updatedParkingSpot;
        }

        System.out.println("Did not find any empty spot!");
        return null;
    }

    public void unParkVehicle(Ticket ticket, Vehicle vehicle){
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        ParkingSpot updatedParkingSpot = ParkingSpot.builder()
                .id(parkingSpot.getId())
                .isEmpty(true)
                .type(vehicle.getType())
                .VehicleNo("")
                .build();
        parkingSpotList.remove(parkingSpot);
        parkingSpotList.add(updatedParkingSpot);
    }
}
