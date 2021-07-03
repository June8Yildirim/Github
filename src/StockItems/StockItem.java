package StockItems;

public class StockItem {
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;
    private double salesTax;



    public StockItem(String stockNumber, String name, double price) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
        this.salesTax = 10;
    }

    public void increaseTotalStock(int newStock){
        this.totalStock += newStock;
    }

    public double calculateTotalPrice(){
        return this.price * this.totalStock;

    }
    public String getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

}
