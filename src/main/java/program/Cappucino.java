package program;

public class Cappucino extends Coffee {
    public Cappucino() {
        name = "Cappucino";
        price = 95;
        ingredients.add(new Ingredient("Espresso Shot", "1 shot"));
        ingredients.add(new Ingredient("Foamed Milk", "Free-pour milk to the cup rim"));
    }

}
