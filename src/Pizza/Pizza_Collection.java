package Pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Pizza_Collection {

    private PizzaInt[] list;
    private File theFile;

    Pizza_Collection(File f) throws FileNotFoundException {
        theFile = f;
        list = new PizzaInt[0];
        read();
    }

    Pizza_Collection(String name) throws FileNotFoundException {
        this(new File(name));
    }

    public void read() throws FileNotFoundException {
        if (theFile.exists()) {
            Scanner sc = new Scanner(theFile);
            int size = Integer.parseInt(sc.nextLine());
            list = new PizzaInt[size];
            for (int index = 0; index < size; index++) {
                String name = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                list[index] = new Pizza(name, price);
            }
            sc.close();
        }
    }

    public void write() throws FileNotFoundException {
        PrintStream stream = new PrintStream(theFile);
        stream.println(list.length);
        for (int index = 0; index < list.length; index++) {
            stream.println(list[index].getName());
            stream.println(list[index].getPrice());
        }
        stream.close();
    }

    public void add(String name, double price) {
        PizzaInt[] listnew = Arrays.copyOf(list, list.length + 1);
        listnew[list.length] = new Pizza(name, price);
        list = listnew;
    }

    public void delete(int index) {
        PizzaInt[] listNew = Arrays.copyOf(list, list.length - 1);
        for (int pos = index + 1; pos < list.length; pos++) {
            listNew[pos - 1] = list[pos];
        }
        list = listNew;
    }


    public void view() {
        for (int index = 0; index < list.length; index++) {
            System.out.printf("%3d : %s : $%.2f%n", index+1, list[index].getName(), list[index].getPrice());
        }
    }
}
//    Pizza Hawaiian = new Pizza_Menu("Hawaiian", 15.50);
//    Pizza FourCheese = new Pizza_Menu("Four Cheese", 12.5);
//    Pizza nettuno = new Pizza_Menu("Nettuno", 11.0);
//    Pizza capriccioso = new Pizza_Menu("Capriccioso", 14.0);
//    Pizza alfredo = new Pizza_Menu("Alfredo", 14.5);
//    Pizza meatLover = new Pizza_Menu("Meat Lover", 13.5);
//

