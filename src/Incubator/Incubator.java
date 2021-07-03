package Incubator;

public class Incubator {
    private int temperature;

    public int MAX =10;
    public int MIN =-10;

    public Incubator() {
        this.temperature = 5;
    }

    public boolean increaseTemperature() {
        if (temperature >= MAX || temperature <= MIN) {
            System.out.println("Tmp not be less than 10 or -10");
            return false;
        } else {
            ++this.temperature;
            return true;
        }
    }

    public boolean decreaseTemperature(){
        if (temperature > MAX && temperature < MIN) {
            System.out.println("Tmp not be less than 10 or -10");
            return false;
        } else {
            --this.temperature;
            return true;
        }    }

    public int getTemperature() {
        return temperature;
    }
}
