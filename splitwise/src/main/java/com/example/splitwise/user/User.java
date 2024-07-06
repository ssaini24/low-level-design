package com.example.splitwise.user;

public class User {
    String id;
    String name;
    ExpenseBalanceSheet sheet;

    public User(String id, String name, ExpenseBalanceSheet sheet) {
        this.id = id;
        this.name = name;
        this.sheet = sheet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpenseBalanceSheet getSheet() {
        return sheet;
    }

    public void setSheet(ExpenseBalanceSheet sheet) {
        this.sheet = sheet;
    }
}
