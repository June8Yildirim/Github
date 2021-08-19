package Pizza;

public class PizzaConstantsApp implements PizzaConstants {
    public static void main(String[] args){
        double specialPrice =12.99;
        System.out.println("Welcome to "+COMPANY);
        System.out.println("We're having a special offere: \na " +
                SMALL_DIAMETER+" inch pizza with four toppings \nor a " +
                LARGE_DIAMETER+" inch pizza with topping for only $"+ +specialPrice);
        System.out.println("With tax, that is only $"+(specialPrice+specialPrice*TAX_RATE));
    }
}
