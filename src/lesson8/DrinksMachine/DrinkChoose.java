package lesson8.DrinksMachine;

import java.util.Arrays;
import java.util.Scanner;

public class DrinkChoose {

    public double totalCost;
    public static void main(String[] args) {

        boolean count = true;

        new DrinkPrint().chooseOrder();
        Scanner chooseDrink = new Scanner(System.in);
        String beverage = chooseDrink.next().toUpperCase();
        Drink beverages = Drink.valueOf(beverage);
        new TotalCost().inputNumber();

        while (count) {
            switch (beverages) {
                case COFFEE -> {
                    new TotalCost().costDrink(Drink.COFFEE);
                    new Cooking().coffeeReady();
                }
                case TEA -> {
                    new TotalCost().costDrink(Drink.TEA);
                    new Cooking().teaReady();
                }
                case LEMONADE -> {
                    new TotalCost().costDrink(Drink.LEMONADE);
                    new Cooking().lemonadeReady();
                }
                case MOJITO -> {
                    new TotalCost().costDrink(Drink.MOJITO);
                    new Cooking().mojitoReady();
                }
                case COCA_COLA -> {
                    new TotalCost().costDrink(Drink.COCA_COLA);
                }
                case MINERAL_WATER -> {
                    new TotalCost().costDrink(Drink.MINERAL_WATER);
                }
            }
                count = false;

        }
    }
}









