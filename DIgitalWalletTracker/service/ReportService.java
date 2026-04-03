package service;

import model.Transaction;
import java.time.LocalDate;
import java.util.*;

public class ReportService {

    public void generateReport(List<Transaction> list, LocalDate start, LocalDate end) {
        double total = 0;

        for (Transaction t : list) {
            LocalDate d = t.getDateTime().toLocalDate();

            if ((d.isAfter(start) || d.isEqual(start)) &&
                (d.isBefore(end) || d.isEqual(end))) {

                System.out.println(t);
                total += t.getAmount();
            }
        }

        System.out.println("Total: " + total);
    }
}