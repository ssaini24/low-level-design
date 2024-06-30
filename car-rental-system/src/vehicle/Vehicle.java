package vehicle;

public class Vehicle {
    String id;
    String number;
    VehicleType type;
    VehicleStatus status;

    public Vehicle(String id, String number, VehicleType type, VehicleStatus status) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
