package com.example.elevator.car;

import com.example.elevator.user.User;

public class InternalButtons {
    InternalDispatcher buttonDispatcher;

    public InternalButtons(InternalDispatcher buttonDispatcher) {
        this.buttonDispatcher = buttonDispatcher;
    }

    public void pressButton(User user){
        buttonDispatcher.submitInternalRequest(user);
    }
}
