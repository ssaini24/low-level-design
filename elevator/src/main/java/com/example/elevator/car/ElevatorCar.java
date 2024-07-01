package com.example.elevator.car;

public class ElevatorCar {
  int id;
  Display display;
  ElevatorStatus status;
  InternalButtons internalButtons;

  public ElevatorCar(int id, Display display, ElevatorStatus status,
      InternalButtons internalButtons) {
    this.id = id;
    this.display = display;
    this.status = status;
    this.internalButtons = internalButtons;
  }

  public void move(int floor, Direction direction){

  }
}
