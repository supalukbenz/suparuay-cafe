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
        while (!exit.matches("[xX]")){
            if(isBill(enter)) {
                exit = "x";
                return;
            }
            mainMenu();
        }
        if(orders != null) {
            System.out.println("\t\t\t\t\tTotal Order");
            bill();
        }
        System.out.println("\n\t\t\t\tThank you.\n");

    }

    public static void mainMenu() {
        System.out.println("\n[Menu]");
        System.out.println("---------------------------------------------");
        System.out.printf("|\t%s\t\t|\n", "Enter the command of order type.");
        System.out.printf("| %-12s %-25s\t|\n", "Command", "Order");
        System.out.printf("| %-10s %-25s\t\t|\n", "1", "Coffee");
        System.out.printf("| %-10s %-25s\t\t|\n", "2", "Dessert");
        System.out.printf("| %-10s %-25s\t\t|\n", "T", "Get Total");
        System.out.printf("| %-10s %-25s\t\t|\n", "E", "End of order and Bill");
        System.out.printf("| %-10s %-25s\t\t|\n", "Q", "Quit from Suparuay cafe");
        System.out.println("---------------------------------------------");

        System.out.println();
        enter = checkInput(1, 2);

        if (isExit(enter) || isBill(enter)) {
            exit = "x";
            System.out.println("Exit");
            return;
        } else if (isTotal(enter)) {
            getTotalOrder();
            return;
        }

        int enterCommand = Integer.parseInt(enter);

        switch (enterCommand){
            case 1:
                orderCoffee();
                break;
            case 2:
                orderDessert();
                break;
            default:
                break;
        }

    }


    public static void getTotalOrder() {
        orders.showTotal();
    }

    public static void orderCoffee() {

        System.out.println("\n[Coffee]");
        System.out.println("-----------------------------------------------------");
        System.out.printf("|\t\t%s\t\t\t|\n", "Enter the command of Coffee Drink.");
        System.out.printf("| %-12s %-25s %8s\t|\n", "Command", "Coffee", "Price");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "1", "Americano", "80");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "2", "Cappucino", "95");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "3", "Latte", "90");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "4", "Mocha", "105");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "5", "Caramel Macchiato", "120");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "Q", "Back to Main Menu", " ");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "T", "Get Total", " ");
        System.out.printf("| %-10s %-25s %8s\t\t|\n", "E", "End of order and Bill", " ");
        System.out.println("-----------------------------------------------------");


        enter = checkInput(1, 5);

        if(isExit(enter)){
            return;
        }else if (isBill(enter)) {
            enter = "x";
            return;
        }else if (isTotal(enter)) {
            getTotalOrder();
            return;
        }

        int enterCommand = Integer.parseInt(enter);

        switch(enterCommand) {
            case 1:
                Coffee coffee1 = new Americano();
                orders.addOrder(coffee1);
                break;
            case 2:
                Coffee coffee2 = new Cappucino();
                addTopping(coffee2);
                orders.addOrder(coffee2);
                break;
            case 3:
                Coffee coffee3 = new Latte();
                addTopping(coffee3);
                orders.addOrder(coffee3);
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
        System.out.println("\n[Status]");
        dailyDessert();

        enter = checkAvailableDessert();

        if(isExit(enter)){
            return;
        }else if (isBill(enter)) {
            enter = "x";
            return;
        }else if (isTotal(enter)) {
            getTotalOrder();
            return;
        }

        int index = Integer.parseInt(enter);
        Dessert dessert = dailyDessert().get(index-1);
        orders.addOrder(dessert);

    }

    public static List<Dessert> dailyDessert() {
        List<Dessert> desserts = new ArrayList<Dessert>();
        int count = 1;
        System.out.println("\n[Dessert]");
        System.out.println("-----------------------------------------------------");
        System.out.printf("|\t\t%s\t\t\t\t|\n", "Enter the command of Desserts.");
        System.out.printf("| %-12s %-25s %8s\t|\n", "Command", "Dessert", "Price");

        for (String type: types) {
            Dessert dessert = DessertFactory.createDesserts(type);
            System.out.printf("| %-12d %-25s %8.0f\t|\n", count, dessert.getName(), dessert.getPrice());
            desserts.add(dessert);
            count++;
        }
        System.out.printf("| %-12s %-25s %8s\t|\n", "Q", "Back to Main Menu", " ");
        System.out.printf("| %-12s %-25s %8s\t|\n", "T", "Get Total", " ");
        System.out.printf("| %-12s %-25s %8s\t|\n", "E", "End of order and Bill", " ");
        System.out.println("-----------------------------------------------------");

        return desserts;
    }

    public static void addTopping(Coffee coffee) {
        Coffee c = coffee;

        System.out.println("\n[Topping]");
        System.out.println("\t\tAdd toppings?");
        System.out.println("YES, ..");
        System.out.printf("\t  1 %-20s %-8s\n", "Chocolate Chip", "35");
        System.out.printf("\t  2 %-20s %-8s\n", "Coffee Jelly", "10");
        System.out.printf("\t  3 %-20s %-8s\n", "Whip Cream", "25");
        System.out.println("NO, ..");
        System.out.println("\t  Q Back to main menu");
        System.out.println("\t  T Get Total");
        System.out.println("\t  E End of order and Bill");


        enter = checkInput(1, 3);

        if(isExit(enter)){
            return;
        }else if (isBill(enter)) {
            enter = "x";
            return;
        }else if (isTotal(enter)) {
            getTotalOrder();
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



    public static void bill() {
        System.out.println("\n\n[End of Order]");
        orders.showTotal();
        System.out.println();
        System.out.println("Total Order: " + orders.getSize());
        System.out.println("\tDessert Order: " + orders.getCountDessert());
        System.out.println("\tCoffee Order: " + orders.getCountCoffee());
        System.out.println();
        if(orders.getCountCoffee() > 0){
            toBarista();
        }

    }

    public static void toBarista() {
        System.out.println("-------------------To Barista-------------------");
        orders.prepareOrderCoffee();
        System.out.println("------------------------------------------------");
    }


    public static boolean isExit(String e) {
        return e.matches("[qQ]");
    }

    public static boolean isBill(String e) {
        return e.matches("[eE]");
    }

    public static boolean isTotal(String e) {
        return e.matches("[tT]");
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
            } else if(enter.matches("[qQeE]")){
                commandResult = enter;
                break;
            }else if(enter.matches("[tT]")){
                return "t";
            }
            else {
                System.out.println("Invalid command.");
            }

        }
        return commandResult;
    }



}
