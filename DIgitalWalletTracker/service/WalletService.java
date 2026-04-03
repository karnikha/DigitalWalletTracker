package service;

import model.*;
import java.util.*;

public class WalletService {
    private List<Transaction> transactions = new ArrayList<>();
    private User user;

    public WalletService(User user) {
        this.user = user;
    }

    public void addExpense(double amt, String desc, String cat, String mode) {
        Expense e = new Expense(amt, desc, cat, mode);
        transactions.add(e);
        user.addExpense(amt);
    }

    public void addIncome(double amt, String desc) {
        Income i = new Income(amt, desc, "Income", "NA");
        transactions.add(i);
        user.addIncome(amt);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public List<Transaction> getByCategory(String cat) {
        List<Transaction> list = new ArrayList<>();
        for (Transaction t : transactions)
            if (t.getCategory().equalsIgnoreCase(cat))
                list.add(t);
        return list;
    }
}