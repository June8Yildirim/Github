package Pizza;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PizzaApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Pizza_Collection data;
        if (args.length > 0) {
            data = new Pizza_Collection(args[0]);
        } else {
            System.out.print("Enter data file name: ");
            data = new Pizza_Collection(sc.nextLine());
        }
        String input = "";
        do {
            System.out.println("Enter your choice by first letter: ");
            System.out.print("View, Add, Delete, Quit ");
            input = sc.nextLine().toUpperCase();
            switch (input.charAt(0)) {
                case 'V':
                    data.view();break;
                case 'A':
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter price : ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println();
                    data.add(name, price); break;
                case 'D':
                    System.out.printf("Enter index: ");
                    data.delete(Integer.parseInt(sc.nextLine())); break;
            }
        } while (!input.startsWith("Q"));
        data.write();
    }
}
