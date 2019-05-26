package program;

public class Americano extends Coffee {
    public Americano() {
        name = "Americano";
        price = 80;
        ingredients.add(new Ingredient("Espresso Shot", "2 shot"));
        ingredients.add(new Ingredient("Hot Water", "Fill to ¼ below rim"));
    }
}
