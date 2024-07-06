package com.example.splitwise;

import com.example.splitwise.app.ExpenseController;
import com.example.splitwise.expense.Expense;
import com.example.splitwise.group.Group;
import com.example.splitwise.split.Split;
import com.example.splitwise.split.SplitType;
import com.example.splitwise.user.BalanceSheetController;
import com.example.splitwise.user.ExpenseBalanceSheet;
import com.example.splitwise.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Init {

    public static void init(){
        ExpenseController expenseController = new ExpenseController();
        User sahil = new User("U1", "sahil", new ExpenseBalanceSheet());
        User rehan = new User("U2", "rehan", new ExpenseBalanceSheet());
        User naman = new User("U3", "naman", new ExpenseBalanceSheet());

        List<User> users = new ArrayList<>();
        users.add(sahil);
        users.add(rehan);
        users.add(naman);

        Group grpOne = new Group(expenseController, new ArrayList<>(), "G1", "Tosh Valley", users);

        Expense expense = new Expense(3000, "E1", sahil,
                Arrays.asList(new Split(1000, sahil), new Split(1000, rehan), new Split(1000, naman)),
                SplitType.Equal);

        grpOne.createExpense(expense);

        Expense expense1 = new Expense(6000, "E2", naman,
                Arrays.asList(new Split(2000, sahil), new Split(2000, rehan), new Split(2000, naman)),
                SplitType.Equal);

        grpOne.createExpense(expense1);

        BalanceSheetController.getBalanceSheet(sahil);
        BalanceSheetController.getBalanceSheet(naman);
    }

}
