package io.bakoish.model.menu;

import io.bakoish.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class MexicanMenu {
    private final List<Dish> mexicanDishes;

    public MexicanMenu() {
        mexicanDishes = new ArrayList<>();
        this.mexicanDishes.add(new Dish("Tortilla", 10.0,"Good tortilla", 500.0));
        this.mexicanDishes.add(new Dish("Nachos", 15.0,"Yummy nachos", 350.0));
    }

    public Dish getMexicanDish(int dishNumber) {
        if(dishNumber > 0 && dishNumber <= mexicanDishes.size()) {
            try {
                return mexicanDishes.get(dishNumber-1);
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("There is no dish with number like that!");
        return null;

    }

    public String toString() {
        StringBuilder message = new StringBuilder("In mexican menu we have:").append(System.getProperty("line.separator"));
        for(int i=0;i<mexicanDishes.size();i++){
            message.append(i+1).append(" - ").append(mexicanDishes.get(i).getName()).append(" which costs ").append(mexicanDishes.get(i).getPrice()).append("USD").append(System.getProperty("line.separator"));;
        }
        return String.valueOf(message);
    }

}
