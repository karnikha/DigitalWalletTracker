package ui;

import model.User;

public class ProfileUI {
    public static void show(User user) {
        System.out.println("Hello " + user.getUsername());
        System.out.println("Balance: " + user.getBalance());
        System.out.println("Income: " + user.getTotalIncome());
        System.out.println("Expense: " + user.getTotalExpense());
        System.out.println("Savings: " + user.getSavings());
        System.out.println("Exceeded: " + user.getExceededExpense());
    }
}