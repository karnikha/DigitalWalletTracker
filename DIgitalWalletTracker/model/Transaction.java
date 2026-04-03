package model;

import java.time.LocalDateTime;

public abstract class Transaction {
    protected double amount;
    protected String description;
    protected String category;
    protected String paymentMode;
    protected LocalDateTime dateTime;

    public Transaction(double amount, String description, String category, String paymentMode) {
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.paymentMode = paymentMode;
        this.dateTime = LocalDateTime.now();
    }

    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public LocalDateTime getDateTime() { return dateTime; }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " | " + amount + " | " + category + " | " + dateTime;
    }
}