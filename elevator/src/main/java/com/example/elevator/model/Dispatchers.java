package com.example.elevator.model;

import com.example.elevator.building.ExternalButtonDispatcher;
import com.example.elevator.car.InternalDispatcher;

public class Dispatchers {

    InternalDispatcher internalDispatcher;

    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButtonDispatcher getExternalButtonDispatcher() {
        return externalButtonDispatcher;
    }

    public void setExternalButtonDispatcher(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public InternalDispatcher getInternalDispatcher() {
        return internalDispatcher;
    }

    public void setInternalDispatcher(InternalDispatcher internalDispatcher) {
        this.internalDispatcher = internalDispatcher;
    }
}
