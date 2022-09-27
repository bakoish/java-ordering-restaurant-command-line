package io.bakoish.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DishTest {

    private Dish dish;
    private String name;
    private Double price;
    private String details;
    private Double weight;

    @BeforeEach
    void init() {

        name = "Dish";
        price = 10.0;
        details = "Details";
        weight = 20.0;

        dish = new Dish(name,price,details,weight);
        assertNotNull(dish);
    }

    @Test
    void getWeight() {
        assertEquals(dish.getWeight(),weight);
    }

    @Test
    void setWeight() {
        assertEquals(dish.getWeight(),weight);
        Double newWeight = 25.0;
        dish.setWeight(newWeight);
        assertEquals(dish.getWeight(),newWeight);
    }
}