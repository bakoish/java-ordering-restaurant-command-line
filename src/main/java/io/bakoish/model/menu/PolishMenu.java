package io.bakoish.model.menu;

import io.bakoish.model.Dish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PolishMenu {

    private final List<Dish> polishDishes;

    public PolishMenu() {
        polishDishes = new ArrayList<>();
        polishDishes.add(new Dish("Pierogi", 20.0,"Pyszne pierogi", 500.0));
        polishDishes.add(new Dish("Schabowy", 25.0,"Pyszny schabowy", 550.0));
    }

    public Dish getPolishDish(int dishNumber) {
        if(dishNumber > 0 && dishNumber <= polishDishes.size()) {
            try {
                return polishDishes.get(dishNumber-1);
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("There is no dish with number like that!");
        return null;

    }

    public String toString() {
        StringBuilder message = new StringBuilder("In polish menu we have:").append(System.getProperty("line.separator"));
        for(int i=0;i<polishDishes.size();i++){
            message.append(i+1).append(" - ").append(polishDishes.get(i).getName()).append(" which costs ").append(polishDishes.get(i).getPrice()).append("USD").append(System.getProperty("line.separator"));
        }
        return String.valueOf(message);
    }
}
