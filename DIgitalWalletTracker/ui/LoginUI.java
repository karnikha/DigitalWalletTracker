package ui;

import model.User;
import java.util.Scanner;

public class LoginUI {
    public static User login(Scanner sc) {
        System.out.print("Username: ");
        String u = sc.next();

        System.out.print("PIN: ");
        String p = sc.next();

        return new User(u, p);
    }
}