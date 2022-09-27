package io.bakoish.model.menu;

import io.bakoish.model.Dish;
import io.bakoish.model.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkMenu {

    private final List<Drink> drinksMenu;

    public DrinkMenu() {
        drinksMenu = new ArrayList<>();
        this.drinksMenu.add(new Drink("Beer",5.0,"White beer",500.0));
        this.drinksMenu.add(new Drink("Water",2.0,"Pure water",300.0));
    }

    public Drink getDrink(int drinkNumber) {
        if(drinkNumber > 0 && drinkNumber <= drinksMenu.size()) {
            try {
                return drinksMenu.get(drinkNumber-1);
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("There is no drink with number like that!");
        return null;

    }

    public String toString() {
        StringBuilder message = new StringBuilder("In drinks menu we have:").append(System.getProperty("line.separator"));
        for(int i=0;i<drinksMenu.size();i++){
            message.append(i+1).append(" - ").append(drinksMenu.get(i).getName()).append(" which costs ").append(drinksMenu.get(i).getPrice()).append("USD").append(System.getProperty("line.separator"));
        }
        return String.valueOf(message);
    }
}
