package bill;

import reservation.Reservation;

public class Bill {
    Reservation reservation;
    boolean isBillPaid;
    int amount;

    public Bill(Reservation reservation){
        this.reservation = reservation;
        // calculate amount using reservation
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isBillPaid() {
        return isBillPaid;
    }

    public void setBillPaid(boolean billPaid) {
        isBillPaid = billPaid;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
