package com.example.splitwise.app;

import com.example.splitwise.expense.Expense;
import com.example.splitwise.split.Split;
import com.example.splitwise.user.BalanceSheetController;
import com.example.splitwise.user.User;

import java.util.List;

public class ExpenseController {
    Expense expense;

    public void createExpense(Expense expense){
        BalanceSheetController.updateBalanceSheet(expense.getPaidBy(), expense.getSplits());
    }
}
