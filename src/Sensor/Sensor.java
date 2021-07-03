package Sensor;

public class Sensor {
    private double pressure;

    public Sensor(double pressure) {
        try {
            if (pressure >= 0){
                this.pressure = pressure;
            }else{
                pressure =0;
            }
        }catch (Exception e){}
    }



    public double getPressure() {
        return pressure;
    }

    public boolean setPressure(double pressure) {
        if (pressure<0){
                System.out.println("pressure not be less than 0.");
                return false;
        }
        this.pressure = pressure;
        return true;
    }
}
