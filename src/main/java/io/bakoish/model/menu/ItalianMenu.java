package io.bakoish.model.menu;

import io.bakoish.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class ItalianMenu {

    private final List<Dish> italianDishes;

    public ItalianMenu() {
        italianDishes = new ArrayList<>();
        this.italianDishes.add(new Dish("Pizza", 23.0,"Good pizza with peperoni", 200.0));
        this.italianDishes.add(new Dish("Pasta", 45.0,"Yummy pasta with chicken", 450.0));
    }

    public Dish getItalianDish(int dishNumber) {
        if(dishNumber > 0 && dishNumber <= italianDishes.size()) {
            try {
                return italianDishes.get(dishNumber-1);
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("There is no dish with number like that!");
        return null;

    }

    public String toString() {
        StringBuilder message = new StringBuilder("In italian menu we have:").append(System.getProperty("line.separator"));
        for(int i=0;i<italianDishes.size();i++){
            message.append(i+1).append(" - ").append(italianDishes.get(i).getName()).append(" which costs ").append(italianDishes.get(i).getPrice()).append("USD").append(System.getProperty("line.separator"));
        }
        return String.valueOf(message);
    }
}
