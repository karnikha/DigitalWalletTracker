package service;

import model.*;
import java.util.*;

public class BudgetService {
    private Map<String, Budget> budgets = new HashMap<>();

    public void setBudget(String category, double limit) {
        budgets.put(category, new Budget(category, limit));
    }

    public void updateExpense(String category, double amt) {
        if (budgets.containsKey(category)) {
            Budget b = budgets.get(category);
            b.addExpense(amt);

            if (b.isExceeded())
                System.out.println("⚠️ Budget exceeded for " + category);
        }
    }

    public void showBudgets() {
        for (Budget b : budgets.values()) {
            System.out.println(b.getCategory() + " Remaining: " + b.getRemaining());
        }
    }
}