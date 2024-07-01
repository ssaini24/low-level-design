package com.example.elevator.car;

public class Display {

  int floor;
  Direction direction;

  public Display(Direction direction, int floor) {
    this.direction = direction;
    this.floor = floor;
  }

  public Direction getDirection() {
    return direction;
  }

  public int getFloor() {
    return floor;
  }
}
