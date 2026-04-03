package ui;

import service.*;
import java.util.*;

public class MainUI {

    public static void menu(Scanner sc, WalletService ws, BudgetService bs) {
        while (true) {
            System.out.println("\n1.Add Expense\n2.Add Income\n3.View All\n4.Filter\n5.Back");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    double a = sc.nextDouble();
                    System.out.print("Category: ");
                    String c = sc.next();
                    ws.addExpense(a, "exp", c, "cash");
                    bs.updateExpense(c, a);
                    break;

                case 2:
                    System.out.print("Amount: ");
                    ws.addIncome(sc.nextDouble(), "inc");
                    break;

                case 3:
                    ws.getAllTransactions().forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Category: ");
                    ws.getByCategory(sc.next()).forEach(System.out::println);
                    break;

                case 5:
                    return;
            }
        }
    }
}