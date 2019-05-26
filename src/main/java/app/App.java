package app;

import program.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static String enter = "", exit = "";
    private static OrderList orders = new OrderList();
    private static String[] types = new String[] {"Cake", "Brookie", "Muffin", null};

    public static void main(String[] args) {
        System.out.println();
        System.out.println("\n\t\t\tWelcome to Suparuay Cafe\n");
        while (!exit.matches("[eE]")){
            mainMenu();
        }
        if(orders != null) {

        }
        bill();

    }

    public static void mainMenu() {
        System.out.println("---------------------------------------------");
        System.out.printf("|\t%s\t\t|\n", "Enter the command of order type.");
        System.out.printf("| %-12s %-25s\t|\n", "Command", "Order");
        System.out.printf("| %-10s %-25s\t\t|\n", "1", "Coffee");
        System.out.printf("| %-10s %-25s\t\t|\n", "2", "Dessert");
        System.out.printf("| %-10s %-25s\t\t|\n", "B", "End of order and get Bill");
        System.out.printf("| %-10s %-25s\t\t|\n", "Q", "Exit from Suparuay cafe");
        System.out.println("---------------------------------------------");

        System.out.println();
        enter = checkInput(1, 2);

        if (isExit(enter)) {
            exit = "e";
            System.out.println("Exit");
            return;
        }

        int enterCommand = Integer.parseInt(enter);

        switch (enterCommand){
            case 1:
                orderCoffee();
                break;
            case 2:
                orderTea();
                break;
            case 3:
                orderDessert();
                break;
            default:
                break;
        }


    }

    public static void orderCoffee() {

        System.out.println("-----------------------------------------------------");
        System.out.printf("|\t\t%s\t\t\t|\n", "Enter the command of Coffee Drink.");
        System.out.printf("| %-12s %-25s %8s\t|\n", "Command", "Coffee", "Price");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "1", "Americano", "80");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "2", "Cappucino", "95");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "3", "Latte", "90");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "4", "Mocha", "105");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "5", "Caramel Macchiato", "120");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "B", "Get Bill", " ");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "Q", "Exit from Suparuay cafe", " ");
        System.out.println("-----------------------------------------------------");


        enter = checkInput(1, 5);

        if(isExit(enter)){
            return;
        }

        int enterCommand = Integer.parseInt(enter);

        switch(enterCommand) {
            case 1:
                Coffee coffee1 = new Americano();
                orders.addOrder(coffee1);
                System.out.println(orders.getName());
                break;
            case 2:
                Coffee coffee2 = new Cappucino();
                addTopping(coffee2);
                orders.addOrder(coffee2);
                System.out.println(orders.getName());
                break;
            case 3:
                Coffee coffee3 = new Latte();
                addTopping(coffee3);
                orders.addOrder(coffee3);
                System.out.println(orders.getName());
                break;
            case 4:
                Coffee coffee4 = new Mocha();
                addTopping(coffee4);
                orders.addOrder(coffee4);
                break;
            case 5:
                Coffee coffee5 = new CaramelMacchiato();
                addTopping(coffee5);
                orders.addOrder(coffee5);
                break;
            default:
                break;
        }

    }

    public static void orderDessert() {
        System.out.println("Enter the number.");
        System.out.println(">> Status");
        dailyDessert();
        System.out.println("\nB Ask for the bill");
        System.out.println("Q Back to main menu\n");

        enter = checkAvailableDessert();

        if(isExit(enter)) return;

        int index = Integer.parseInt(enter);
        Dessert dessert = dailyDessert().get(index-1);
        orders.addOrder(dessert);

    }

    public static List<Dessert> dailyDessert() {
        List<Dessert> desserts = new ArrayList<Dessert>();
        int count = 1;
        System.out.println("-----------------------------------------------------");
        System.out.printf("|\t\t%s\t\t\t|\n", "Enter the command of Coffee Drink.");
        System.out.printf("| %-12s %-25s %8s\t|\n", "Command", "Dessert", "Price");

        for (String type: types) {
            Dessert dessert = DessertFactory.createDesserts(type);
            System.out.printf("| %-12d %-25s %8.0f\n", count, dessert.getName(), dessert.getPrice());
            desserts.add(dessert);
            count++;
        }
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "B", "Get Bill", " ");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "Q", "Exit from Suparuay cafe", " ");
        System.out.println("-----------------------------------------------------");

        return desserts;
    }

    public static void addTopping(Coffee coffee) {
        Coffee c = coffee;
        System.out.println("\nAdd toppings?");
        System.out.println("YES, ..");
        System.out.println("1 Chocolate Ship");
        System.out.println("2 Coffee Jelly");
        System.out.println("3 Whip Cream\n");
        System.out.println("NO, ..");
        System.out.println("B Ask for the bill");
        System.out.println("Q Back to main menu");


        enter = checkInput(1, 3);
        if(isExit(enter)) {
            return;
        }
        int toppingCommand = Integer.parseInt(enter);

        switch (toppingCommand){
            case 1:
                c.addTopping(new ChocolateChip(c));
                break;
            case 2:
                c.addTopping(new CoffeeJelly(c));
                break;
            case 3:
                c.addTopping(new WhipCream(c));
                break;
            default:
                break;
        }


    }

    public static void addAnotherMenu() {
        System.out.println("\nAdd another order?");
        System.out.println("YES, ..");
        System.out.println("1 Coffee menu");
        System.out.println("NO, ..");
        System.out.println("B Ask for the bill");
        System.out.println("Q Back to another menu\n");

        enter = checkInput(1, 1);

        if(isExit(enter)){
            return;
        }

        orderCoffee();


    }

    public static void bill() {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(orders.getName());
        System.out.println(orders.getTotal());

    }

    public static void toBarista() {
        System.out.println("----------To Barista-----------");
        orders.prepareOrderCoffee();
        System.out.println("-------------------------------");
    }

    public static void orderTea() {

    }


    public static boolean isExit(String e) {
        return e.matches("[qQbB]");
    }

    public static String checkAvailableDessert() {
        enter = checkInput(1, types.length+1);
        if(enter.matches("[dBqQ]")) return enter;
        int command = Integer.parseInt(enter);
        if(types[command-1] == null) {
            System.out.println("Sorry, this dessert is out of stock.");
            return "q";
        }
        else return enter;
    }

    public static String checkInput(int start, int end) {
        int command = 0;
        String enter = "", commandResult = "";

        while(true){

            System.out.print(">>> ");
            enter = scanner.next();

            if(enter.matches("[\\d]")) {
                command = Integer.parseInt(enter);
                if(command >= start && command <= end) {

                    commandResult = String.valueOf(command);
                    break;
                }
                else System.out.println("Sorry, there is no menu for this number.");
            } else if(enter.matches("[qQbB]")){

                commandResult = enter;
                break;
            }
            else {
                System.out.println("Invalid command.");
            }

        }
        return commandResult;
    }



}
