package ui;

import java.util.Scanner;

public class UserMenu {

    Scanner scanner = new Scanner(System.in);

    public void showUserMenu() {
        while (true) {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Browse Properties");
            System.out.println("2. Search by Criteria");
            System.out.println("3. Send a Request for a Property");
            System.out.println("4. Go Back to Main Menu");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // TODO: List all available properties
                    break;
                case 2:
                    // TODO: Search properties by price, location, etc.
                    break;
                case 3:
                    // TODO: Send a buying/renting request
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
