package cafe.store;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import program.*;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefStore {

    OrderList orderList;
    double priceCoffee = 0;
    double priceTopping = 0;
    Dessert dessert;
    String[] types = new String[] {"Cake", "Brookie", "Muffin", null};

    @Before
    public void setUp() {
        orderList = new OrderList();
    }

    @Given("I have (.+) already in coffee order.")
    public void have_coffee_order(String name){
        orderList.addOrder(CoffeeFactory.createCoffee(name));
    }

    @Given("I have (.+) already in dessert order.")
    public void have_dessert_order(String name){
        orderList.addOrder(DessertFactory.createDesserts(name));
    }

    @When("I add (.+) dessert order.")
    public void add_dessert_order(String name){
        orderList.addOrder( DessertFactory.createDesserts(name));
    }

    @When("I add (.+) coffee order.")
    public void add_coffee_order(String name){
        orderList.addOrder( CoffeeFactory.createCoffee(name));
    }

    @When("I want to add (.+) coffee to order and add the (.+) topping")
    public void add_topping(String name, String topping){
        Coffee coffee = CoffeeFactory.createCoffee(name);
        priceCoffee = coffee.getPrice();
        Topping t = ToppingFactory.createTopping(topping, coffee);
        priceTopping = t.getPrice();
        coffee.addTopping(t);
        orderList.addOrder(coffee);
    }

    @Then("The price for this coffee from adding topping should be (.+).")
    public void total_changed_from_add_topping(double totalTopping) {
        assertEquals(priceCoffee + priceTopping, totalTopping);
    }

    @Then("The total should be (.*).")
    public void total_should_be(double total) {
        assertEquals(orderList.getTotal(), total);
    }

    @Then("The number of orders should be (.+).")
    public void number_of_orders(int number) {
        assertEquals(orderList.getSize(), number);
    }


}
