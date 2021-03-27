package ro.unibuc.proiect;

public class PhysicalEvent extends Event{

    private Location location;

    public PhysicalEvent(String name, int maxPeople, String type, DateTime dateTime, double minPrice, Location location) {
        super(name, maxPeople, type, dateTime, minPrice);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocation: " + location.toString();
    }
}
