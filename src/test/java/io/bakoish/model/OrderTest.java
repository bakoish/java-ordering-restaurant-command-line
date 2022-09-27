package io.bakoish.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private String clientName;
    private Order order;

    @BeforeEach
    void init() {
        clientName = "XYZ";
        order = new Order(clientName);
        assertNotNull(order);
    }

    @Test
    void getOrderCostAndAddDish() {
        String dishName = "DishName";
        Double weight = 100.0;
        Double price = 10.0;
        String details = "Details";

        Dish dish = new Dish(dishName,price,details,weight);
        assertNotNull(dish);
        assertEquals(order.getOrderCost(),0.0);
        order.addDish(dish);
        assertEquals(order.getOrderCost(),price);
    }

    @Test
    void addDrink() {

        String dishName = "DishName";
        Double capacity = 100.0;
        Double price = 10.0;
        String details = "Details";
        Drink drink = new Drink(dishName,price,details,capacity);

        assertEquals(order.getOrderCost(),0.0);
        assertNotNull(drink);
        order.addDrink(drink);
        assertEquals(order.getOrderCost(),price);
    }

    @Test
    void getClientName() {
        assertEquals(order.getClientName(),clientName);
    }

    @Test
    void testToString() {
        String x = String.valueOf(order);
        assertTrue(x.length()>0);
    }
}