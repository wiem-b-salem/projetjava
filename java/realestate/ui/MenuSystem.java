package ui;

import java.util.Scanner;

public class MenuSystem {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Welcome to the Real Estate Agency!");
            System.out.println("Choose an option:");
            System.out.println("1. Login as User");
            System.out.println("2. Login as Landlord");
            System.out.println("3. New User - Sign Up");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            switch (choice) {
                case 1:
                    UserMenu userMenu = new UserMenu();
                    userMenu.showUserMenu();
                    break;
                case 2:
                    LandlordMenu landlordMenu = new LandlordMenu();
                    landlordMenu.showLandlordMenu();
                    break;
                case 3:
                    NewUserMenu newUserMenu = new NewUserMenu();
                    newUserMenu.showNewUserMenu();
                    break;
                case 4:
                    System.out.println("Thank you! Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
