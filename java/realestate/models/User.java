package models;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private char type; // 'a' = buyer/renter, 'b' = seller/landlord
    private String email;
    private String phone;
    private String password;

    public User(String id, String firstName, String lastName, char type, String email, String phone, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public char getType() { return type; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getPassword() { return password; }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Type: " + (type == 'a' ? "Buyer/Renter" : "Seller/Landlord"));
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
