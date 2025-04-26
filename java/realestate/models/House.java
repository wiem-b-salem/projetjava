package models;

public class House extends Property {
    private boolean garden;
    private boolean pool;

    public House(String status, String title, double price, String location, int bedrooms, int bathrooms,
                 boolean gas, boolean hautStanding, String amenities, boolean garage,
                 boolean garden, boolean pool) {
        super("House", status, title, price, location, bedrooms, bathrooms, gas, hautStanding, amenities, garage);
        this.garden = garden;
        this.pool = pool;
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
                "", "", "", // pet, floor, elevator empty
                garden ? "Yes" : "No",
                pool ? "Yes" : "No"
        );
    }
}
