package models;

public class Apartment extends Property {
    private boolean petFriendly;
    private int floor;
    private boolean elevator;

    public Apartment(String status, String title, double price, String location, int bedrooms, int bathrooms,
                     boolean gas, boolean hautStanding, String amenities, boolean garage,
                     boolean petFriendly, int floor, boolean elevator) {
        super("Apartment", status, title, price, location, bedrooms, bathrooms, gas, hautStanding, amenities, garage);
        this.petFriendly = petFriendly;
        this.floor = floor;
        this.elevator = elevator;
    }

    @Override
    public String toDataString() {
        return String.join(";",
                type, status, title, String.valueOf(price), location,
                String.valueOf(bedrooms), String.valueOf(bathrooms),
                gas ? "Yes" : "No",
                hautStanding ? "Yes" : "No",
                amenities,
                garage ? "Yes" : "No",
                petFriendly ? "Yes" : "No",
                String.valueOf(floor),
                elevator ? "Yes" : "No",
                "", "" // garden and pool empty
        );
    }
}
