package program;

public class WhipCream implements Topping {

    private Coffee coffee;

    public WhipCream(Coffee c) {
        this.coffee = c;
        c.setPrice(c.price + getPrice());
    }

    public String getName() {
        return coffee.getName();
    }

    public double getPrice() {
        return 25;
    }

    public String getDescription() {
        return "+ add topping Whip Cream";
    }

}
