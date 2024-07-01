package com.example.elevator.car;

import com.example.elevator.carcontroller.CarController;
import com.example.elevator.user.User;

public class InternalDispatcher {
    CarController carController;

    public InternalDispatcher(CarController carController) {
        this.carController = carController;
    }

    public void submitInternalRequest(User user){
        carController.submitRequest(user);
    }
}

