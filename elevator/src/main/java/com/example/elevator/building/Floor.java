package com.example.elevator.building;

public class Floor {

    ExternalButtons externalButtons;
    int floorNo;

    public Floor(ExternalButtons externalButtons, int floorNo) {
        this.externalButtons = externalButtons;
        this.floorNo = floorNo;
    }
}
