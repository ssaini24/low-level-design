package vehicle;

public class Car extends Vehicle {
    public Car(String id, String number, VehicleStatus status){
        super(id, number, VehicleType.CAR, status);
    }
}
