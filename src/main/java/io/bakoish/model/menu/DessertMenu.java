package io.bakoish.model.menu;

import io.bakoish.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class DessertMenu {

    private final List<Dish> dessertMenu;

    public DessertMenu() {
        dessertMenu = new ArrayList<>();
        this.dessertMenu.add(new Dish("Ice cream", 20.0,"Vanila icream", 100.0));
        this.dessertMenu.add(new Dish("Apple pie", 12.0,"Yummy apple pie", 250.0));
    }

    public Dish getDessertDish(int dishNumber) {
        if(dishNumber > 0 && dishNumber <= dessertMenu.size()) {
            try {
                return dessertMenu.get(dishNumber-1);
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("There is no dish with number like that!");
        return null;

    }

    public String toString() {
        StringBuilder message = new StringBuilder("In dessert menu we have:").append(System.getProperty("line.separator"));
        for(int i=0;i<dessertMenu.size();i++){
            message.append(i+1).append(" - ").append(dessertMenu.get(i).getName()).append(" which costs ").append(dessertMenu.get(i).getPrice()).append("USD").append(System.getProperty("line.separator"));
        }
        return String.valueOf(message);
    }
}
