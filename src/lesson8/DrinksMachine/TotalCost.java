package lesson8.DrinksMachine;

import java.util.Scanner;

public class TotalCost {
    static int number;
    double totalCost;

    public static void inputNumber() {
        Scanner chooseNumber = new Scanner(System.in);
        number = chooseNumber.nextInt();
    }
    public void costDrink(Drink drink) {
        if (number > 0) {
            switch (drink) {
                case COFFEE -> totalCost = number * Drink.COFFEE.price;
                case TEA -> totalCost = number * Drink.TEA.price;
                case MOJITO -> totalCost = number * Drink.MOJITO.price;
                case LEMONADE -> totalCost = number * Drink.LEMONADE.price;
                case MINERAL_WATER -> totalCost = number * Drink.MINERAL_WATER.price;
                case COCA_COLA -> totalCost = number * Drink.COCA_COLA.price;
            }
            System.out.println("Total cost order: " + "$" + totalCost);
        }
    }
}












