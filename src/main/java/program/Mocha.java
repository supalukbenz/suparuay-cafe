package program;

public class Mocha extends Coffee {
    public Mocha() {
        name = "Mocha";
        price = 105;
        ingredients.add(new Ingredient("Espresso Shot", "1 shot"));
        ingredients.add(new Ingredient("Cocoa Sauce", "2 pumps"));
        ingredients.add(new Ingredient("Steamed Milk", "Fill to ¼ below rim"));
    }
}
