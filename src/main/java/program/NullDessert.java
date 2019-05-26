package program;

public class NullDessert extends Dessert {
    private String name;
    private double price;

    public NullDessert() {
        name = "Out of stock";
        price = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
