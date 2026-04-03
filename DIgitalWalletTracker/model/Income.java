package model;

public class Income extends Transaction {
    public Income(double amt, String desc, String cat, String mode) {
        super(amt, desc, cat, mode);
    }

    public String getType() {
        return "Income";
    }
}