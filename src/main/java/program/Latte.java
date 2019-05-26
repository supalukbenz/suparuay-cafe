package program;

public class Latte extends Coffee {
    public Latte() {
        name = "Latte";
        price = 90;
        ingredients.add(new Ingredient("Espresso Shot", "1 shot"));
        ingredients.add(new Ingredient("Steamed Milk", "Fill to ¼ below rim"));
        ingredients.add(new Ingredient("Foamed Milk Top", "Top with ¼ foamed milk"));
    }
}
