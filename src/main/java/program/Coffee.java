package program;

import java.util.ArrayList;

public class Coffee implements Order {
    String name;
    double price;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<Topping> topping = new ArrayList<Topping>();

    public void prepare() {
        System.out.println("Prepare " + name);

        if(ingredients != null) {
            System.out.println("Mix ingredients: ");
            for (Ingredient i: ingredients) {
                System.out.print("\t");
                System.out.println(i.getIngredient() + ": " + i.getVolume());
            }
        }

        if(topping != null) {
            System.out.println("Add topping: ");
            for (Topping t: topping) {
                System.out.print("\t");
                System.out.println(t.getDescription());
            }
        }
        System.out.println("Order: " + name + " finished\n");
    }


    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addTopping(Topping t) {
        topping.add(t);
    }
}
