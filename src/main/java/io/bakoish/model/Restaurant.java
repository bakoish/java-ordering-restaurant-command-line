package io.bakoish.model;

import io.bakoish.model.menu.RestaurantMenu;

import java.util.Scanner;

import static io.bakoish.model.cls.Cls.cls;
import static java.lang.System.exit;

public class Restaurant {

    public static void restaurant() {

        int option = 0;
        Order order = null;
        RestaurantMenu restaurantMenu = new RestaurantMenu();

        while (true)
        {
            option = showMenu();

            switch (option) {
                case 1:
                    order = newOrder();
                    break;
                case 2:
                    if(order == null) {
                        System.out.println("Please start new order before adding dish.");
                    }
                    else {
                        addLunch(order,restaurantMenu);
                    }
                    break;
                case 3:
                    if(order == null) {
                        System.out.println("Please start new order before adding dish.");
                    }
                    else {
                        addDrink(order,restaurantMenu);
                    }
                    break;
                case 4:
                    if(order != null) {
                        if(order.getOrderCost() == 0.0) {
                            System.out.println("Sorry you ordered nothing :(.");
                        }
                        else {
                            System.out.println(order);
                        }
                    }
                    else{
                        System.out.println("Please start new order before adding dish.");
                    }
                    break;
                case 5:
                    if(order != null) {
                        if(order.getOrderCost() == 0.0) {
                            System.out.println("Sorry you ordered nothing :(.");
                        }
                        else {
                            if(finalization(order,restaurantMenu)) order = null;
                        }
                    }
                    else{
                        System.out.println("Please start new order before adding dish.");
                    }
                    break;
                case 6:
                    System.out.println("See you!");
                    exit(0);
                default:
                    System.out.println("Sorry, please enter valid option");
                    break;
            }
        }

    }


    private static int showMenu() {
        System.out.println("--- XYZ RESTAURANT MENU ---");
        System.out.println("Please input number:");
        System.out.println("1 - Start new order");
        System.out.println("2 - Add lunch");
        System.out.println("3 - Add drink");
        System.out.println("4 - What is in my order?");
        System.out.println("5 - Finalization");
        System.out.println("6 - Exit");

        Scanner in = new Scanner(System.in);
        cls();
        return in.nextInt();
    }

    static Order newOrder() {
        System.out.println("Hello, welcome to XYZ restaurant.");
        System.out.println("What's your name?");

        Scanner in = new Scanner(System.in);
        Order order = new Order(in.nextLine());

        System.out.println("Hello "+order.getClientName()+". Please select what do you want:");
        return order;
    }
    private static void addDrink(Order order, RestaurantMenu restaurantMenu) {
        System.out.println("Dear "+order.getClientName()+".");
        restaurantMenu.printDrinkingMenu();
        Scanner in = new Scanner(System.in);
        Drink selectedDrink = restaurantMenu.getDrink(in.nextInt());
        if(selectedDrink == null) {
            System.out.println("Sorry, wrong selection please order new drink.");
            return;
        }

        System.out.println("Would you like a ice cubes with?");

        int option = 0;
        while (true)
        {
            option = restaurantMenu.getYesNoSelection();

            switch (option) {
                case 1:
                    selectedDrink.addIceCube();
                    break;
                case 2:
                case 3:
                    break;
                default:
                    System.out.println("Sorry, please enter valid option");
            }
            if(option > 0 && option < 4) break;
        }

        System.out.println("Would you like a lemon with?");

        while (true)
        {
            option = restaurantMenu.getYesNoSelection();

            switch (option) {
                case 1:
                    selectedDrink.addLemon();
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Sorry, please enter valid option");
            }
            if(option > 0 && option < 4) break;
        }

        order.addDrink(selectedDrink);
        System.out.println("Thank you for ordering drink! Your drink:");
        System.out.println(selectedDrink);

    }

    private static void addLunch(Order order, RestaurantMenu restaurantMenu) {
        System.out.println("Dear "+order.getClientName()+". In lunch you can select one main dish and one dessert.");
        restaurantMenu.printLunchMenu();

        int option = restaurantMenu.selectLunchMenu();

        Dish selectedDish = null;
        Dish selectedDessert;
        Scanner in = new Scanner(System.in);

        switch (option) {
            case 1:
                restaurantMenu.printPolishMenu();
                System.out.println("Please select polish dish:");
                selectedDish = restaurantMenu.getPolishDish(in.nextInt());
                break;
            case 2:
                restaurantMenu.printMexicanMenu();
                System.out.println("Please select mexican dish:");
                selectedDish = restaurantMenu.getMexicanDish(in.nextInt());
                break;
            case 3:
                restaurantMenu.printItalianMenu();
                System.out.println("Please select italian dish:");
                selectedDish = restaurantMenu.getItialianDish(in.nextInt());
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Sorry, please enter valid option");
        }

        if(selectedDish == null) {
            System.out.println("Sorry, wrong selection please order new lunch.");
            return;
        }

        restaurantMenu.printDessertMenu();
        System.out.println("Please select dessert dish:");
        selectedDessert = restaurantMenu.getDessertDish(in.nextInt());

        if(selectedDessert == null) {
            System.out.println("Sorry, wrong selection please order new lunch.");
            return;
        }
        order.addDish(selectedDish);
        order.addDish(selectedDessert);
        System.out.println("Thank you for ordering lunch! your order:");
        System.out.println(selectedDish);
        System.out.println(selectedDessert);

    }
    private static boolean finalization(Order order, RestaurantMenu restaurantMenu) {

        System.out.println("To sum up:");
        System.out.println(order);
        System.out.println("This will cost you: " + order.getOrderCost());
        System.out.println("Would you like to pay?");

        while(true) {
            int option = restaurantMenu.getYesNoSelection();

            switch (option) {
                case 1:
                    System.out.println("Thank you for ordering!");
                    return true;
                case 2:
                case 3:
                    break;
                default:
                    System.out.println("Sorry, please enter valid option");
            }
            if(option > 0 && option < 4) break;
        }

        return false;

    }
}
