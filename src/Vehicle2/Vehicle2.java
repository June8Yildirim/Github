package Vehicle2;

public abstract class Vehicle2 {

    private String powerSource;
    private int wheels;
    protected int price;

    public Vehicle2(String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract void setPrice();

    public String getPowerSource() {
        return powerSource;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPrice() {
        return price;
    }


    public String toString() {
        return "Vehicle2{" +
                "powerSource='" + powerSource + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
}


