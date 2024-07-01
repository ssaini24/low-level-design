package com.example.elevator.car;

public class ElevatorCar {
  int id;
  Display display;
  ElevatorStatus status;

  public ElevatorCar(int id, Display display, ElevatorStatus status) {
    this.id = id;
    this.display = display;
    this.status = status;
  }

    public Display getDisplay() {
        return display;
    }

    public int getId() {
        return id;
    }

    public ElevatorStatus getStatus() {
        return status;
    }

    public void move(int curFloor, int desFloor){
    System.out.println("moving from curFloor " + curFloor + " to destination floor" + desFloor);
  }
}
