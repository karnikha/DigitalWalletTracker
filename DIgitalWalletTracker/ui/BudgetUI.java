package ui;

import service.BudgetService;
import java.util.Scanner;

public class BudgetUI {
    public static void manage(Scanner sc, BudgetService bs) {
        System.out.print("Category: ");
        String c = sc.next();

        System.out.print("Limit: ");
        double l = sc.nextDouble();

        bs.setBudget(c, l);
        bs.showBudgets();
    }
}