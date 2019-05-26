package program;

public class Muffin extends Dessert{

    private String name;
    private double price;

    public Muffin() {
        name = "Mandarin Cranberry Muffin";
        price = 65;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
