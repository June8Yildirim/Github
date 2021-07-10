package Vehicle;

public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;

    public SecondHandVehicle(String regNo, String make, int manufacturer, double value, int numberOfOwners) {
        super(regNo, make, manufacturer, value);
        this.numberOfOwners = numberOfOwners;
    }


    public boolean hasMultipleOwners() {
        return numberOfOwners >= 1;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }
}

