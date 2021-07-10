package Vehicle;

public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacturer;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufacturer, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufacturer = yearOfManufacturer;
        this.value = value;
    }

    public int calculateAge(int year){
        return year - this.yearOfManufacturer;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
