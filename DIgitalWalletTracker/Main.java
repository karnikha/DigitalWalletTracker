import java.util.Scanner;
import model.User;
import service.*;
import ui.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = LoginUI.login(sc);

        WalletService ws = new WalletService(user);
        BudgetService bs = new BudgetService();

        while (true) {
            System.out.println("\n1.Profile\n2.Main\n3.Report\n4.Budget\n5.Summary\n6.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> ProfileUI.show(user);
                case 2 -> MainUI.menu(sc, ws, bs);
                case 3 -> ReportUI.show(sc, ws);
                case 4 -> BudgetUI.manage(sc, bs);
                case 5 -> SummaryUI.show(ws);
                case 6 -> System.exit(0);
            }
        }
    }
}