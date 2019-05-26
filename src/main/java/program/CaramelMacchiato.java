package program;

public class CaramelMacchiato extends Coffee {
    public CaramelMacchiato() {
        name = "Caramel Macchiato";
        price = 120;
        ingredients.add(new Ingredient("Espresso Shot", "1 shot"));
        ingredients.add(new Ingredient("Vanilla Syrup", "1 pump"));
        ingredients.add(new Ingredient("Steamed Milk", "Fill to ¼ below rim"));
        ingredients.add(new Ingredient("Foamed Milk", "Top with foam to ½ below the rim of the cup"));
        ingredients.add(new Ingredient("Caramel Sauce", "Top with caramel sauce"));
    }
}
