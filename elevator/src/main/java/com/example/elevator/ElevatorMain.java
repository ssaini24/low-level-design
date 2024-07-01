package com.example.elevator;

import com.example.elevator.car.*;
import com.example.elevator.carcontroller.CarController;
import com.example.elevator.user.User;

import java.util.PriorityQueue;

public class ElevatorMain {
    public static final int totalFloor = 8;

    public static void execute(){
        int currFloor = 4;
        Display display = new Display(Direction.UP, currFloor);

        ElevatorCar elevatorCar = new ElevatorCar(12, display, ElevatorStatus.IDLE);

        PriorityQueue<User> minPQ = new PriorityQueue<>((User a, User b) -> a.getDesFloor() - b.getDesFloor());
        PriorityQueue<User> maxPQ = new PriorityQueue<>((User a, User b) -> b.getDesFloor() - a.getDesFloor());
        CarController carController = new CarController(elevatorCar, minPQ, maxPQ);

        InternalDispatcher internalDispatcher = new InternalDispatcher(carController);
        InternalButtons internalButtons = new InternalButtons(internalDispatcher);

        User userPreference = new User(5, 8, "U12", "Tom");
        internalButtons.pressButton(userPreference);

        userPreference = new User(6, 7, "U13", "Hardy");
        internalButtons.pressButton(userPreference);
    }
}
