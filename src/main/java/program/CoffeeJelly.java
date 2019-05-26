package program;

public class CoffeeJelly implements Topping {
    private Coffee coffee;

    public CoffeeJelly(Coffee c) {
        this.coffee = c;
        c.setPrice(c.price + getPrice());
    }

    public String getName() {
        return coffee.getName();
    }

    public double getPrice() {
        return 10;
    }

    public String getDescription() {
        return "+ add topping Coffee Jelly";
    }
}
