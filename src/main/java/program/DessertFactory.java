package program;

public class DessertFactory {

    public static Dessert createDesserts(String type) {
        Dessert dessert = null;
        if("Cake".equalsIgnoreCase(type)) dessert = new Cake();
        else if("Brookie".equalsIgnoreCase(type)) dessert = new Brookie();
        else if("Muffin".equalsIgnoreCase(type)) dessert = new Muffin();
        else if("Waffle".equalsIgnoreCase(type)) dessert = new Waffle();
        else dessert = new NullDessert();
        return dessert;
    }
}
