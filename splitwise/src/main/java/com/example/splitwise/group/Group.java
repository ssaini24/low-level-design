package com.example.splitwise.group;

import com.example.splitwise.app.ExpenseController;
import com.example.splitwise.expense.Expense;
import com.example.splitwise.user.User;

import java.util.List;

public class Group {

    String id;
    String name;
    List<User> users;
    List<Expense> expenses;
    ExpenseController expenseController;

    public Group(ExpenseController expenseController, List<Expense> expenses, String id, String name, List<User> users) {
        this.expenseController = expenseController;
        this.expenses = expenses;
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public void createExpense(Expense expense){
        expenses.add(expense);
        expenseController.createExpense(expense);
    }
}
