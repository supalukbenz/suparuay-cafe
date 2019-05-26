package program;

import java.util.ArrayList;
import java.util.List;

public  class OrderList implements Order{

    private List<Order> orders = new ArrayList<Order>();

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void removeOrder(Order o) {
        orders.remove(o);
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
        str.append("-------------------------\n");
        for(Order o: orders) {
            str.append(count + ".)");
            str.append(o.getName() + "\t" + o.getPrice() + " Baht\n");
            count++;
        }

        return str.toString();
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
