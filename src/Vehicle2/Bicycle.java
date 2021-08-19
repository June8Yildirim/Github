package Vehicle2;

import javax.swing.*;

public class Bicycle extends Vehicle2 {
    public Bicycle() {
        super("a person", 2);
    }
    @Override
    public void setPrice(){
        String entry;
        final int MAX = 400;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if (price < MAX){
            price = MAX;
        }
    }

    @Override
    public String toString()
    {
        return("The bicycle is powered by " + getPowerSource() +
                "; it has " + getWheels() + " wheels and costs $" +
                getPrice());
    }
}
