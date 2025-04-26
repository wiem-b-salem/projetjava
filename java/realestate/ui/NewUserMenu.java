package ui;

import java.util.Scanner;
import models.User;
import services.UserManager;

public class NewUserMenu {

    Scanner scanner = new Scanner(System.in);
    UserManager userManager = new UserManager();

    public void showNewUserMenu() {
        System.out.println("\n--- New User Registration ---");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Type (a = Buyer/Renter, b = Seller/Landlord): ");
        char type = scanner.nextLine().charAt(0);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Create a new user object
        User newUser = new User("", firstName, lastName, type, email, phone, password); // ID is generated later
        userManager.saveUser(newUser);

        System.out.println("User registered successfully!");
        System.out.println("Welcome to the Real Estate Agency!");
    }
}
