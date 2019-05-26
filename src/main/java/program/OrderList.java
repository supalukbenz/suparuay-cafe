package program;

import java.util.ArrayList;
import java.util.List;

public class OrderList implements Order{

    private List<Order> orders = new ArrayList<Order>();

    private int countCoffee = 0, countDessert = 0;

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void removeOrder(Order o) {
        orders.remove(o);
    }

    public int getCountCoffee() {
        return countCoffee;
    }

    public int getCountDessert() {
        return countDessert;
    }

    public double getTotal() {
        double total = 0;
        for(Order o: orders) {
            total += o.getPrice();
        }
        return total;
    }

    public String getOrder() {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(Order o: orders) {
            str.append(count + ".)");
            str.append(o.getName() + "\t" + o.getPrice() + " Baht\n");
            count++;
        }

        return str.toString();
    }

    public void showTotal() {
        int count = 1;
        countCoffee = 0;
        countDessert = 0;
        System.out.println("\n[Total]");
        System.out.println("-----------------------------------------------------");
        System.out.printf("|\t\t\t\t%s\t\t\t\t\t\t|\n", "Suparuay Cafe.");
        System.out.printf("| %-12s| %-25s| %-8s |\t\n", "No.", "Order", "Price");
        for(Order o: orders) {
            if(o instanceof Coffee){

                countCoffee++;

            }else if(o instanceof Dessert) {
                countDessert++;
            }
            System.out.printf("| %-12d| %-25s| %-8.0f |\t\n", count, o.getName(), o.getPrice());
            count++;
        }
        System.out.printf("| %-12s %-25s %8.2f\t|\n", " ", "Total", getTotal());
        System.out.println("-----------------------------------------------------");
        System.out.println("\n");
    }


    public List<Order> getOrderList() {
        return orders;
    }

    public void prepareOrderCoffee() {
        for(Order o: orders) {
            if(o instanceof Coffee) {
                ((Coffee) o).prepare();
            }
        }
    }


    public String getName() {
        return getOrder();
    }

    public double getPrice() {
        return getTotal();
    }

    public int getSize() {
        return orders.size();
    }
}
