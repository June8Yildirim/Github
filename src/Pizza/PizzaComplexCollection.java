package Pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaComplexCollection {
    private PizzaComplexInt[] list;
    private File theFile;

    private static final String separator= "\t";
    private static final String comma= ", ";
    PizzaComplexCollection(String name) throws FileNotFoundException{
        this(new File(name));
    }

    PizzaComplexCollection(File f ) throws FileNotFoundException{
        theFile = f;
        list = new PizzaComplexInt[0];
        read();
    }
    public void read() throws FileNotFoundException{
        if (theFile.exists()){
            Scanner sc = new Scanner(theFile);
            int size = Integer.parseInt(sc.nextLine());
            list = new PizzaComplexInt[size];
            for (int index =0; index<size; index++){
                String name = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                String[] ingredients = sc.nextLine().split(separator);
                list[index]= new PizzaComplex(name, price, ingredients);
            }

            sc.close();
        }
    }
    public void write() throws FileNotFoundException{
        PrintStream stream = new PrintStream(theFile);
        stream.println(list.length);
        for (int index= 0; index < list.length; index++){
            stream.println(list[index].getName());
            stream.println(list[index].getPrice());
            stream.println(list[index].encodeIngredients(separator));
        }
        stream.close();
    }

    public void add(String name, double price, String[] ingredients){
        PizzaComplexInt[] listNew = Arrays.copyOf(list,list.length+1);
        listNew[list.length]= new PizzaComplex(name, price, ingredients);
        list = listNew;
    }
    public void delete (int index){
        PizzaComplexInt[] listNew = Arrays.copyOf(list,list.length-1);
        for (int pos = index+1; pos < list.length;pos++){
            listNew[pos-1] = list[pos];
        }
        list = listNew;
    }

    public void view(){
        for (int index =0;index < list.length;index++){
            System.out.printf("%3s:%s:$%.2f:%s\n",index, list[index].getName(), list[index].getPrice(), list[index].encodeIngredients(comma));
        }
    }
    public void search(String c){
        for (int index =0;index< list.length;index++){
            if (list[index].hasIngredient(c)){
                System.out.printf("%3s:%s:$%.2f:%s\n",index, list[index].getName(), list[index].getPrice(), list[index].encodeIngredients(comma));
            }
        }
    }

}
