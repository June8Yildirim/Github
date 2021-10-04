package Pizza;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class PizzaComplexMain {
    public static void main(String[] args) throws IOException {
        PizzaComplexCollection data;
        Scanner sc = new Scanner(System.in);
        String input = "";
        if (args.length > 0) {
            data = new PizzaComplexCollection(args[0]);
        } else {
            System.out.print("Enter data file name: ");
            data = new PizzaComplexCollection(sc.nextLine());
        }



        do {
            System.out.println("Enter your choice by first letter: ");
            System.out.print("View, Add, Delete, Search, Quit ");
            input = sc.nextLine().toUpperCase();
            switch (input.charAt(0)) {
                case 'V':
                    data.view();
                    break;
                case 'A':
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter price : ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter ingredients seperated by comma: ");
                    String[] ing = sc.nextLine().split(",");
                    data.add(name, price, ing);
                    break;
                case 'D':
                    System.out.printf("Enter index : ");
                    data.delete(Integer.parseInt(sc.nextLine()));
                    break;
                case 'S':
                    System.out.printf("Enter key : ");
                    data.search(sc.nextLine());
            }
        } while (!input.startsWith("Q"));
        data.write();
    }
}
