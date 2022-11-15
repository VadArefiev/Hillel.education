package lesson8.DrinksMachine;

import java.util.Scanner;

public class DrinkMachine {

    public static void main(String[] args) {

        boolean count = true;
        new DrinkPrint().priceDrink();
        new DrinkPrint().chooseOrder();
        Scanner chooseDrink = new Scanner(System.in);
        String beverage = chooseDrink.next().toUpperCase();
        Drink beverages = Drink.valueOf(beverage);
        new DrinkPrint().chooseQuantity();
        TotalCost.inputNumber();

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









