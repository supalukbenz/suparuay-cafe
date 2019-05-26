package program;

public class Cake extends Dessert {

    private String name;
    private double price;

    public Cake() {
        name = "Signature Cake";
        price = 150;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
