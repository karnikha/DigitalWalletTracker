package ui;

import service.WalletService;

public class SummaryUI {
    public static void show(WalletService ws) {
        double inc = 0, exp = 0;

        for (var t : ws.getAllTransactions()) {
            if (t.getType().equals("Income"))
                inc += t.getAmount();
            else
                exp += t.getAmount();
        }

        System.out.println("Income: " + inc);
        System.out.println("Expense: " + exp);
        System.out.println("Balance: " + (inc - exp));
    }
}