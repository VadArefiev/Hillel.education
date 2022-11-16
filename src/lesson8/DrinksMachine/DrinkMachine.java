package lesson8.DrinksMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DrinkMachine {

    /**
     * Tools used:
     *  1) enums (drinks)
     *  2) constants (prices)
     *  3) static (total cost)
     *  4) switch (drink selection)
     * Exercise:
     *  #1 make an enum DrinksMachine that can make COFFEE, TEA, LEMONADE, MOJITO, MINERAL, COCA_COLA;
     *  #2 Make a class Drinks, where constants set the price of a drink;
     *  #3 Calculate the number of drinks produced and the total amount the customer has to pay;
     *  #4 Make a method for preparing each drink;
     *  #5 Make a switch-case statement that will make a drink (by calling the appropriate method) depending on the choice of the client;
     *  #6 Add the ability to select a drink for the user, and depending on the choice, make him a drink;
     *  #7 The user should be able to order multiple drinks and at the end see how much money they have to pay;
     */

    public static void main(String[] args) {

        boolean count = true;
        new DrinkPrint().priceDrink();
        new DrinkPrint().chooseOrder();
        Scanner chooseDrink = new Scanner(System.in);
        String beverage = chooseDrink.next().toUpperCase();
        Drink beverages = Drink.valueOf(beverage);
        new DrinkPrint().chooseQuantity();
        while (count) {
            switch (beverages) {
                case COFFEE -> {
                    new TotalCost().costDrink(Drink.COFFEE);
                    CookingMethods.coffeeReady();
                }
                case TEA -> {
                    new TotalCost().costDrink(Drink.TEA);
                    CookingMethods.teaReady();
                }
                case LEMONADE -> {
                    new TotalCost().costDrink(Drink.LEMONADE);
                    CookingMethods.lemonadeReady();
                }
                case MOJITO -> {
                    new TotalCost().costDrink(Drink.MOJITO);
                    CookingMethods.mojitoReady();
                }
                case COCA_COLA -> new TotalCost().costDrink(Drink.COCA_COLA);
                case MINERAL_WATER -> new TotalCost().costDrink(Drink.MINERAL_WATER);
            }
            count = false;
        }
    }
}
