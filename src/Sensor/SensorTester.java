package Sensor;

public class SensorTester {
    public static void main(String[]args){
        Sensor s = new Sensor(20);
        SafeSensor  ss = new SafeSensor(20);
        SafeSensor ss1 = new SafeSensor(30,40);
        System.out.println("first pressure  : "+ ss.getMax());
        System.out.println("second pressure : "+ ss1.getMax());
        System.out.println("set max pressure: "+ ss1.setMax(50));
        System.out.println();
        System.out.println(s.getPressure());
        s.setPressure(-2);
        System.out.println(s.getPressure());
        s.setPressure(10);
    }
}
