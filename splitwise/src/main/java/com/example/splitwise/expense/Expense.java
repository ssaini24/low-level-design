package com.example.splitwise.expense;

import com.example.splitwise.split.Split;
import com.example.splitwise.split.SplitType;
import com.example.splitwise.user.User;

import java.util.List;

public class Expense {
    String id;
    double amount;
    User paidBy;
    SplitType type;
    List<Split> splits;

    public Expense(double amount, String id, User paidBy, List<Split> splits, SplitType type) {
        this.amount = amount;
        this.id = id;
        this.paidBy = paidBy;
        this.splits = splits;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public SplitType getType() {
        return type;
    }
}
