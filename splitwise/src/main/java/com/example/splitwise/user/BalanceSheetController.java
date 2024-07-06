package com.example.splitwise.user;

import com.example.splitwise.split.Split;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BalanceSheetController {

    public static void updateBalanceSheet(User paidByUser, List<Split> splits){
        ExpenseBalanceSheet paidByUserSheet = paidByUser.getSheet();
        int paidByUserGetBack = paidByUserSheet.getTotalGetBack();
        Map<String, Balance> paidByMap = paidByUserSheet.getUserBalanceMap();

        for (Split split : splits){
            User splitUser = split.getUser();
            String id = splitUser.getId();
            int owesAmount = split.getShareAmount();
            ExpenseBalanceSheet splitUserSheet = splitUser.getSheet();

            if (Objects.equals(split.getUser().getId(), paidByUser.getId())){
                paidByUserSheet.setTotalExpense(paidByUserSheet.getTotalExpense() + owesAmount);
                continue;
            }

            paidByUserGetBack += owesAmount;

            if (paidByMap.containsKey(splitUser.getId())){
               Balance balance =  paidByMap.get(id);
               balance.setGetBack(owesAmount);
               paidByMap.put(splitUser.getId(), balance);
            } else {
                paidByMap.put(splitUser.getId(), new Balance(owesAmount, 0));
            }

            Map<String, Balance> splitUserMap = splitUserSheet.getUserBalanceMap();

            if (splitUserMap.containsKey(paidByUser.getId())){
                Balance balance =  splitUserMap.get(paidByUser.getId());
                balance.setOwes(owesAmount);
                splitUserMap.put(paidByUser.getId(), balance);
            } else {
                splitUserMap.put(paidByUser.getId(), new Balance(0, owesAmount));
            }

            splitUserSheet.setTotalOwes(splitUserSheet.getTotalOwes() + owesAmount);
        }

        paidByUserSheet.setTotalGetBack(paidByUserGetBack);
    }

    public static void getBalanceSheet(User user){
        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getId());

        ExpenseBalanceSheet userExpenseBalanceSheet =  user.getSheet();

        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalGetBack());
        System.out.println("TotalOwes: " + userExpenseBalanceSheet.getTotalOwes());
        System.out.println("MyExpense: " + userExpenseBalanceSheet.getTotalExpense());

        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserBalanceMap().entrySet()){

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getGetBack() + " YouOwe:" + balance.getOwes());
        }

        System.out.println("---------------------------------------");
    }
}
