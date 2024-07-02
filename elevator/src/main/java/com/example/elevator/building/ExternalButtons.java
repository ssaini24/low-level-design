package com.example.elevator.building;

import com.example.elevator.user.User;

public class ExternalButtons {

    ExternalButtonDispatcher buttonDispatcher;

    public ExternalButtons(ExternalButtonDispatcher buttonDispatcher) {
        this.buttonDispatcher = buttonDispatcher;
    }

    public void pressButton(User user){
        buttonDispatcher.submitInternalRequest(user);
    }
}
