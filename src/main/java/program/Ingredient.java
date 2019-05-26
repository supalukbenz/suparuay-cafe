package program;

public class Ingredient {

    String ingredient;
    String volume;

    public Ingredient(String ingredient, String volume) {
        this.ingredient = ingredient;
        this.volume = volume;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

}
