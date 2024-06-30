package payment;

import bill.Bill;

public class Payment {

    Bill bill;

    public Payment(Bill bill){
        this.bill = bill;
    }

    public String pay(){
        // pay amount in bill
        bill.setBillPaid(true);
        return "payment success";
    }
}
