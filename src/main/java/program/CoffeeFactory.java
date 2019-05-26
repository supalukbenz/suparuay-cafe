package program;

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("Americano".equalsIgnoreCase(type)) coffee = new Americano();
        else if("Cappucino".equalsIgnoreCase(type)) coffee = new Cappucino();
        else if("Caramel Macchiato".equalsIgnoreCase(type)) coffee = new CaramelMacchiato();
        else if("Latte".equalsIgnoreCase(type)) coffee = new Latte();
        else if("Mocha".equalsIgnoreCase(type)) coffee = new Mocha();
        else coffee = null;
        return coffee;
    }

}
