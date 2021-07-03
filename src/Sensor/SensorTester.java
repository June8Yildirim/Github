package Sensor;

public class SensorTester {
    public static void main(String[]args){
        Sensor s = new Sensor(20);
        System.out.println(s.getPressure());
        s.setPressure(-2);
        System.out.println(s.getPressure());
        s.setPressure(10);
        System.out.println(s.getPressure());
    }
}
