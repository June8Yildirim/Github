package Sensor;

public class SafeSensor extends Sensor {

    private double max;

    public SafeSensor(double max) {
        this.max = max;
    }

    public SafeSensor(double pressure, double max) {
        super(pressure);
        this.max = max;
    }

    public double getMax() {
        return max;
    }

    public boolean setMax(double max) {
        if (this.max < max) {
            return false;
        } else {
            this.max = max;
            return true;
        }
    }
}
