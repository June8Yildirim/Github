package Pizza;

public interface PizzaComplexInt extends PizzaInt{
    public boolean hasIngredient(String in);
    public String[] getIngredients();
    public String encodeIngredients(String del);
    public static final int SMALL_DIAMETER = 12;
    public static final int LARGE_DIAMETER = 16;
    public static final double TAX_RATE = 0.07;
    public static final String COMPANY = "Antonio's Pizzeria";


}
