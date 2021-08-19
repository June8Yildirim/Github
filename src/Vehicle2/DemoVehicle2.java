package Vehicle2;

import javax.swing.*;

public class DemoVehicle2 {
    public static void main(String[]args){
        Sailboat boat = new Sailboat();
        Bicycle bicycle = new Bicycle();
        JOptionPane.showMessageDialog(null,"\nVehicle Description:\n"+
                boat.toString()+ "\n"+ bicycle.toString());

    }
}
