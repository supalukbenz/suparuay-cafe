package program;

public class Waffle extends Dessert {

    private String name;
    private double price;

    public Waffle() {
        name = "Maple Belgium Waffle";
        price = 110;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
