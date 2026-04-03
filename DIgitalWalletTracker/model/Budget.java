package model;

public class Budget {
    private String category;
    private double limit;
    private double spent;

    public Budget(String category, double limit) {
        this.category = category;
        this.limit = limit;
    }

    public void addExpense(double amt) {
        spent += amt;
    }

    public double getRemaining() {
        return limit - spent;
    }

    public boolean isExceeded() {
        return spent > limit;
    }

    public String getCategory() { return category; }
}