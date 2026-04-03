package model;

public class Expense extends Transaction {
    public Expense(double amt, String desc, String cat, String mode) {
        super(amt, desc, cat, mode);
    }

    public String getType() {
        return "Expense";
    }
}