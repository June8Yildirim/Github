package Pizza;

public class PizzaComplex extends Pizza implements PizzaComplexInt {

    private String[] ingredients;

    public PizzaComplex(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public int LARGE_DIAMETER(){
        return LARGE_DIAMETER;
    }

    public double TAX_RATE(){
        return TAX_RATE;
    }

    public String COMPANY(){
        return COMPANY;
    }

    public int SMALL_DIAMETER(){
        return SMALL_DIAMETER;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public boolean hasIngredient(String c) {
        for (String in : ingredients) {
            if (in.toUpperCase().indexOf(c.toUpperCase()) >= 0) {
                return true;
            }
        }
        return false;
    }

    public String encodeIngredients(String del){
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j<= ingredients.length-1;j++){
            builder.append(ingredients[j]);
        }
        return builder.toString();
    }

    public void pizzaTest(PizzaInt p){
        System.out.println("Name of the pizza: "+p.getName());
        System.out.println("Price of the pizza: "+p.getPrice());
        if (p instanceof PizzaComplex){
            String[] in  = ((PizzaComplex) p ).getIngredients();
        }

    }

}
