package Pizza;

public class Pizza implements PizzaInt {
    private String getName;
    private double getPrice;

    public Pizza(String name, double price) {
        this.getName = name;
        this.getPrice = price;
    }

//    public int LARGE_DIAMETER(){
//        return LARGE_DIAMETER;
//    }
//
//    public double TAX_RATE(){
//        return TAX_RATE;
//    }
//
//    public String COMPANY(){
//        return COMPANY;
//    }
//
//    public int SMALL_DIAMETER(){
//        return SMALL_DIAMETER;
//    }
    @Override
    public String getName() {
        return getName;
    }

    @Override
    public double getPrice() {
        return getPrice;
    }
}
