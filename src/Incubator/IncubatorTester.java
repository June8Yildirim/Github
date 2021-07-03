package Incubator;

public class IncubatorTester {
    public static void main(String[]args){
        Incubator i = new Incubator();
        System.out.println(i.getTemperature());
        for (int j = 0; j < 10; j++) {
            i.increaseTemperature();
            System.out.println(i.getTemperature());
        }
    }
}
