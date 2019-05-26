package program;

public class ChocolateChip implements Topping {

    private Coffee coffee;

    public ChocolateChip(Coffee c) {
        this.coffee = c;
        c.setPrice(c.price + getPrice());
    }

    public String getName() {
        return coffee.getName();
    }

    public double getPrice() {
        return 35;
    }

    public String getDescription() {
        return "+ add topping Chocolate Chip";
    }

}
