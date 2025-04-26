package models;

import java.util.ArrayList;
import java.util.List;

public class Landlord extends User {
    private List<String> propertyIds;

    public Landlord(String id, String firstName, String lastName, String email, String phone, String password) {
        super(id, firstName, lastName, 'c', email, phone, password); // type = 'c' for landlord
        this.propertyIds = new ArrayList<>();
    }

    public List<String> getPropertyIds() {
        return propertyIds;
    }

    public void addPropertyId(String propertyId) {
        propertyIds.add(propertyId);
    }

    public void removePropertyId(String propertyId) {
        propertyIds.remove(propertyId);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Properties Listed: " + propertyIds.size());
    }
}
