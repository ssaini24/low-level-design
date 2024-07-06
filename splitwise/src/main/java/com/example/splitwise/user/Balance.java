package com.example.splitwise.user;

public class Balance {
    int owes;
    int getBack;

    public Balance(int getBack, int owes) {
        this.getBack = getBack;
        this.owes = owes;
    }

    public int getGetBack() {
        return getBack;
    }

    public void setGetBack(int getBack) {
        this.getBack = getBack;
    }

    public int getOwes() {
        return owes;
    }

    public void setOwes(int owes) {
        this.owes = owes;
    }
}
