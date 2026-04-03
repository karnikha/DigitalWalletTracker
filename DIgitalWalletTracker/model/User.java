package model;

public class User {
    private String username;
    private String pin;
    private double balance;
    private double totalIncome;
    private double totalExpense;
    private double savings;
    private double exceededExpense;

    public User(String username, String pin) {
        this.username = username;
        this.pin = pin;
    }

    public String getUsername() { return username; }
    public String getPin() { return pin; }

    public double getBalance() { return balance; }
    public double getTotalIncome() { return totalIncome; }
    public double getTotalExpense() { return totalExpense; }
    public double getSavings() { return savings; }
    public double getExceededExpense() { return exceededExpense; }

    public void addIncome(double amount) {
        totalIncome += amount;
        balance += amount;
    }

    public void addExpense(double amount) {
        totalExpense += amount;
        balance -= amount;
    }

    public void setSavings(double savings) { this.savings = savings; }
    public void addExceededExpense(double amt) { this.exceededExpense += amt; }
}