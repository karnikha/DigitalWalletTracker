package util;

import java.time.LocalDate;
import java.util.Scanner;

public class DateUtil {
    public static LocalDate readDate(Scanner sc) {
        System.out.print("Enter date (yyyy-mm-dd): ");
        return LocalDate.parse(sc.next());
    }
}