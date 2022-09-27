package io.bakoish.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {

    private Food food;
    private String name;
    private Double price;
    private String details;

    @BeforeEach
    void init() {

        name = "Food";
        price = 10.0;
        details = "Details";

        food = new Food(name,price,details);
        assertNotNull(food);
    }
    @Test
    void testToString() {
        String x = String.valueOf(food);
        assertTrue(x.length()>0);
    }

    @Test
    void getName() {
        assertEquals(food.getName(),name);
    }

    @Test
    void setName() {
        assertEquals(food.getName(),name);
        String newName = "New name";
        food.setName(newName);
        assertEquals(food.getName(),newName);
    }

    @Test
    void getPrice() {
        assertEquals(food.getPrice(),price);
    }

    @Test
    void setPrice() {
        assertEquals(food.getName(),name);
        String newName = "New name";
        food.setName(newName);
        assertEquals(food.getName(),newName);
    }

    @Test
    void getDetails() {
        assertEquals(food.getDetails(),details);
    }

    @Test
    void setDetails() {
        String newDetails = "details";
        assertEquals(food.getDetails(),details);
        food.setDetails(newDetails);
        assertEquals(food.getDetails(),newDetails);
    }
}