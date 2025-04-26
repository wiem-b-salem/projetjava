package models;

public abstract class Property {
    protected String type; // Apartment or House
    protected String status; // Rent or Sale
    protected String title;
    protected double price;
    protected String location;
    protected int bedrooms;
    protected int bathrooms;
    protected boolean gas;
    protected boolean hautStanding;
    protected String amenities; // comma separated string
    protected boolean garage;

    public Property(String type, String status, String title, double price, String location, int bedrooms, int bathrooms,
                    boolean gas, boolean hautStanding, String amenities, boolean garage) {
        this.type = type;
        this.status = status;
        this.title = title;
        this.price = price;
        this.location = location;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.gas = gas;
        this.hautStanding = hautStanding;
        this.amenities = amenities;
        this.garage = garage;
    }

    public abstract String toDataString();
}
