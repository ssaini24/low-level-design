package com.example.elevator;

import com.example.elevator.building.Building;
import com.example.elevator.building.ExternalButtonDispatcher;
import com.example.elevator.building.ExternalButtons;
import com.example.elevator.building.Floor;
import com.example.elevator.car.*;
import com.example.elevator.carcontroller.CarController;
import com.example.elevator.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ElevatorMain {
    public static final int totalFloor = 8;
    public static InternalDispatcher internalDispatcher;
    public static ExternalButtonDispatcher externalButtonDispatcher;
    public static Building building;

    public static void execute(){
        initDispatcher();
        pressButtonInternal();
        pressButtonExternal();
    }

    private static void pressButtonInternal(){
        InternalButtons internalButtons = new InternalButtons(internalDispatcher);

        User userPreference = new User(5, 8, "U12", "Tom");
        internalButtons.pressButton(userPreference);

        userPreference = new User(2, 3, "U13", "Hardy");
        internalButtons.pressButton(userPreference);

        userPreference = new User(6, 7, "U14", "Dicky");
        internalButtons.pressButton(userPreference);
    }

    private static void pressButtonExternal(){
        ExternalButtons externalButtons = new ExternalButtons(externalButtonDispatcher);

        List<Floor> floorList = new ArrayList<>();
        Floor floor = new Floor(externalButtons, 7);
        floorList.add(floor);
        building = new Building(floorList);

        User user = new User(7, 6, "U14", "Dicky");
        externalButtons.pressButton(user);
    }

    private static void initDispatcher() {
        int currFloor = 4;
        Display display = new Display(Direction.UP, currFloor);

        ElevatorCar elevatorCar = new ElevatorCar(12, display, ElevatorStatus.IDLE);

        PriorityQueue<User> minPQ = new PriorityQueue<>((User a, User b) -> a.getDesFloor() - b.getDesFloor());
        PriorityQueue<User> maxPQ = new PriorityQueue<>((User a, User b) -> b.getDesFloor() - a.getDesFloor());
        CarController carController = new CarController(elevatorCar, minPQ, maxPQ);

        internalDispatcher = new InternalDispatcher(carController);
        externalButtonDispatcher = new ExternalButtonDispatcher(carController);
    }
}
