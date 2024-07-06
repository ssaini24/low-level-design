package com.example.splitwise.split;

import com.example.splitwise.user.User;

public class Split {
    User user;
    int shareAmount;

    public Split(int shareAmount, User user) {
        this.shareAmount = shareAmount;
        this.user = user;
    }

    public int getShareAmount() {
        return shareAmount;
    }

    public User getUser() {
        return user;
    }
}
