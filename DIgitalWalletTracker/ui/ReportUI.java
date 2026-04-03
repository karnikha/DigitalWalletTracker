package ui;

import service.*;
import util.DateUtil;
import java.util.Scanner;

public class ReportUI {
    public static void show(Scanner sc, WalletService ws) {
        ReportService rs = new ReportService();
        rs.generateReport(ws.getAllTransactions(),
                DateUtil.readDate(sc),
                DateUtil.readDate(sc));
    }
}