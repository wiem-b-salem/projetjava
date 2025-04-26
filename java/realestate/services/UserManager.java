package services;

import models.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private static final String FILE_PATH = "data/users.txt";

    // Load existing users from the file and count the users and landlords
    public List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        int userCount = 0;  // Counter for users
        int landlordCount = 0;  // Counter for landlords
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7) {  // Ensure correct data format
                    users.add(new User(parts[0], parts[1], parts[2], parts[3].charAt(0), parts[4], parts[5], parts[6]));
                    
                    // Count users and landlords based on their type
                    if (parts[2].charAt(0) == 'a') {
                        userCount++;
                    } else if (parts[2].charAt(0) == 'b') {
                        landlordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
        
        // Return the users list and the counts for users and landlords
        return users;
    }

    // Save a new user to the file
    public void saveUser(User user) {
        // Load existing users to count the current users and landlords
        List<User> users = loadUsers();
        int userCount = 0;  // Counter for users
        int landlordCount = 0;  // Counter for landlords
        
        for (User u : users) {
            if (u.getType() == 'a') {
                userCount++;
            } else if (u.getType() == 'b') {
                landlordCount++;
            }
        }

        // Generate the new user ID
        String newId = "";
        if (user.getType() == 'a') {  // User (Buyer/Renter)
            newId = "U" + String.format("%03d", userCount + 1);  // User ID format like U001, U002, etc.
        } else if (user.getType() == 'b') {  // Landlord (Seller)
            newId = "L" + String.format("%03d", landlordCount + 1);  // Landlord ID format like L001, L002, etc.
        }
        
        // Set the ID for the user
        user.setId(newId);

        // Write the user data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(user.getId() + ";" + user.getFirstName() + ";" + user.getLastName() + ";" + user.getType() + ";" + user.getEmail() + ";" + user.getPhone() + ";" + user.getPassword());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }
}
