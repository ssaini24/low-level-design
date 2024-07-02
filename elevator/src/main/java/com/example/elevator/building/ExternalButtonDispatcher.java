package com.example.elevator.building;

import com.example.elevator.carcontroller.CarController;
import com.example.elevator.user.User;

public class ExternalButtonDispatcher {
    CarController carController;

    public ExternalButtonDispatcher(CarController carController) {
        this.carController = carController;
    }

    public void submitInternalRequest(User user){
        carController.submitRequest(user);
    }
}
