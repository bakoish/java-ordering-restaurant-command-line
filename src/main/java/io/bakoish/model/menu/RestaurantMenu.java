package io.bakoish.model.menu;

import io.bakoish.model.Dish;
import io.bakoish.model.Drink;

import java.util.Scanner;

public class RestaurantMenu {

    private final PolishMenu polishMenu;
    private final MexicanMenu mexicanMenu;
    private final ItalianMenu italianMenu;
    private final DrinkMenu drinkMenu;
    private final DessertMenu dessertMenu;

    public RestaurantMenu() {
        this.polishMenu = new PolishMenu();
        this.mexicanMenu = new MexicanMenu();
        this.italianMenu = new ItalianMenu();
        this.drinkMenu = new DrinkMenu();
        this.dessertMenu = new DessertMenu();
    }

    public void printLunchMenu() {
        System.out.println("Lunch menu:");
        System.out.println(polishMenu);
        System.out.println(mexicanMenu);
        System.out.println(italianMenu);
    }
    public int selectLunchMenu() {
        System.out.println("Please select lunch menu:");
        System.out.println("1 - Polish");
        System.out.println("2 - Mexican");
        System.out.println("3 - Italian");
        System.out.println("4 - Exit");

        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public void printDessertMenu() {
        System.out.println(dessertMenu);
    }

    public Dish getDessertDish(int nrDish) {
        return dessertMenu.getDessertDish(nrDish);
    }

    public void printPolishMenu() {
        System.out.println(polishMenu);
    }

    public Dish getPolishDish(int nrDish) {
        return polishMenu.getPolishDish(nrDish);
    }

    public void printMexicanMenu() {
        System.out.println(mexicanMenu);
    }

    public Dish getMexicanDish(int nrDish) {
        return mexicanMenu.getMexicanDish(nrDish);
    }

    public void printItalianMenu() {
        System.out.println(italianMenu);
    }

    public Dish getItialianDish(int nrDish) {
        return italianMenu.getItalianDish(nrDish);
    }

    public void printDrinkingMenu() {
        System.out.println(drinkMenu);
    }

    public Drink getDrink(int nrDish) {
        return drinkMenu.getDrink(nrDish);
    }

    public int getYesNoSelection() {
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        System.out.println("3 - Exit");

        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
