package Vehicle2;

import javax.swing.*;

public class VehicleDatabase {
    public static void main(String[] args) {
        Vehicle2[] vehicles = new Vehicle2[5];
        int x;
        for (x = 0; x < vehicles.length; x++) {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(null, "Enter type of vehicle\n" +
                    "1. Sailboat\n" +
                    "2. Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            if (vehicleType == 1) {
                vehicles[x] = new Sailboat();
            } else {
                vehicles[x] = new Bicycle();
            }
        }
        StringBuffer outString = new StringBuffer();
        for (x = 0; x < vehicles.length; x++) {
            outString.append("\n#" + (x + 1) + " ");
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" +
                outString);
    }
}

