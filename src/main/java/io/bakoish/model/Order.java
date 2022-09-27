package io.bakoish.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final String clientName;
    private final List<Dish> clientDishes;
    private final List<Drink> clientDrinks;

    public Order(String clientName) {
        this.clientName = clientName;
        this.clientDishes = new ArrayList<>();
        this.clientDrinks = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        clientDishes.add(dish);
    }

    public void addDrink(Drink drink) {
        clientDrinks.add(drink);
    }

    public String getClientName() {
        return clientName;
    }

    public Double getOrderCost() {
        Double sum = 0.0;

        if(clientDishes.size() > 0) {
            for (Dish x : clientDishes) sum += x.getPrice();
        }
        if(clientDrinks.size() > 0) {
            for (Drink x : clientDrinks) sum += x.getPrice();
        }

        return sum;
    }

    public String toString() {
        StringBuilder message = new StringBuilder("Summarizing, you ordered:").append(System.getProperty("line.separator"));

        if(clientDishes.size() > 0) {
            for (Dish x : clientDishes) {
                message.append(x).append(" which costs ").append(x.getPrice()).append("USD").append(System.getProperty("line.separator"));
            }
        }
        if(clientDrinks.size() > 0) {
            for (Drink x : clientDrinks) {
                message.append(x).append(" which costs ").append(x.getPrice()).append("USD").append(System.getProperty("line.separator"));
            }
        }

        return String.valueOf(message);
    }
}
