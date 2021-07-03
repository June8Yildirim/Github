package StockItems;

import java.util.Scanner;

public class StockItemTester {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String tempNumber;
        String tempName;
        double tempPrice;
        System.out.print("Enter the stock number: ");
        tempNumber = keyboardString.nextLine();
        System.out.print("Enter the name of the item: ");
        tempName = keyboardString.nextLine();
        System.out.print("Enter the price of the item: ");
        tempPrice = keyboard.nextDouble();

        StockItem item1 = new StockItem(tempNumber,tempName,tempPrice);
        item1.increaseTotalStock(5);
        System.out.println("Total stock of "+item1.getName()+" is "+ item1.getStockNumber());

        System.out.println("Total price of "+item1.getName()+" in our stock "+item1.getTotalStock());

    }
}
