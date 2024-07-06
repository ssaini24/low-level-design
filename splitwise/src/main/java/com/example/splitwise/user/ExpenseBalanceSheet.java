package com.example.splitwise.user;

import java.util.HashMap;
import java.util.Map;

public class ExpenseBalanceSheet {
    Map<String, Balance> userBalanceMap = new HashMap<>();
    int totalOwes;
    int totalGetBack;
    int totalExpense;

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }

    public int getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(int totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public int getTotalOwes() {
        return totalOwes;
    }

    public void setTotalOwes(int totalOwes) {
        this.totalOwes = totalOwes;
    }

    public Map<String, Balance> getUserBalanceMap() {
        return userBalanceMap;
    }

    public void setUserBalanceMap(Map<String, Balance> userBalanceMap) {
        this.userBalanceMap = userBalanceMap;
    }
}
