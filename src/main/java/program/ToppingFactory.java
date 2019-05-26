package program;

public class ToppingFactory {
    public static Topping createTopping(String type, Coffee coffee) {
        Topping topping = null;
        if("Chocolate Chip".equalsIgnoreCase(type)) topping = new ChocolateChip(coffee);
        else if("Coffee Jelly".equalsIgnoreCase(type)) topping = new CoffeeJelly(coffee);
        else if("Whip Cream".equalsIgnoreCase(type)) topping = new WhipCream(coffee);
        else topping = null;
        return topping;
    }
}
