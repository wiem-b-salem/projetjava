package ui;

import java.util.Scanner;

public class LandlordMenu {

    Scanner scanner = new Scanner(System.in);

    public void showLandlordMenu() {
        while (true) {
            System.out.println("\n--- Landlord Menu ---");
            System.out.println("1. Add a Property");
            System.out.println("2. Edit a Property");
            System.out.println("3. Remove a Property");
            System.out.println("4. View Property Requests");
            System.out.println("5. Go Back to Main Menu");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // TODO: Add a property to sell or rent
                    break;
                case 2:
                    // TODO: Edit an existing property
                    break;
                case 3:
                    // TODO: Remove an existing property
                    break;
                case 4:
                    // TODO: See user requests for properties
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
