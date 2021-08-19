package Vehicle2;

import javax.swing.*;
import java.util.Scanner;

public class Sailboat extends Vehicle2{
    private int length;
    public Sailboat(){
        super("wind",0);
        setLength();
    }

    public int getLength() {
        return length;
    }

    public  void setLength() {
      String entry = JOptionPane.showInputDialog(null,"Enter sailboat in feet ");
      length = Integer.parseInt(entry);
    }
    @Override
    public void setPrice(){
        Scanner scanner = new Scanner(System.in);
        String entry;
        final int MAX = 100000;
//        System.out.println("Enter sailboat price: ");
//        price = scanner.nextInt();
        entry = JOptionPane.showInputDialog(null,"Enter sailboat price ");
        price = Integer.parseInt(entry);
        if (price > MAX){
            price = MAX;
        }
    }

    @Override
    public String toString()
    {
        return("The " + getLength() +
                " foot sailboat is powered by " +
                getPowerSource() + "; it has " + getWheels() +
                " wheels and costs $" + getPrice());
    }
}
