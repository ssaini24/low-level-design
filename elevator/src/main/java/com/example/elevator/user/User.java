package com.example.elevator.user;

public class User {
    String name;
    String id;
    int currFloor;
    int desFloor;

    public User(int currFloor, int desFloor, String id, String name) {
        this.currFloor = currFloor;
        this.desFloor = desFloor;
        this.id = id;
        this.name = name;
    }

    public int getCurrFloor() {
        return currFloor;
    }

    public String getId() {
        return id;
    }

    public int getDesFloor() {
        return desFloor;
    }

    public String getName() {
        return name;
    }
}
