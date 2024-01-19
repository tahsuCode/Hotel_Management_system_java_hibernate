package com.hotel.entity;

 

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "billing")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billing_id")
    private int billingId;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

    public Billing() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Billing(int billingId, LocalDate transactionDate, double amount, Guest guest) {
        super();
        this.billingId = billingId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.guest = guest;
    }

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Billing [billingId=" + billingId + ", transactionDate=" + transactionDate + ", amount=" + amount
                + ", guest=" + guest + "]";
    }
}
