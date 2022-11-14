package lesson8.DrinksMachine;

import java.util.Arrays;
import java.util.Scanner;

public class DrinkChoose {

    public static void main(String[] args) {

        int number;
        boolean count = true;

        System.out.println("Choose a drink");
        System.out.println(Arrays.toString(Drinks.values()));
        Scanner chooseDrink = new Scanner(System.in);
        String beverage = chooseDrink.next().toUpperCase();
        Drinks beverages = Drinks.valueOf(beverage);

        while (count) {
            switch (beverages) {
                case COFFEE -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.LEMONADE + " = " +
                            Drinks.COFFEE.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.COFFEE + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.COFFEE.getPrice() + "$");
                        new Cooking().coffeeReady();
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }

                case TEA -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.TEA + " = " +
                            Drinks.TEA.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.TEA + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.TEA.getPrice() + "$");
                        new Cooking().teaReady();
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }

                case LEMONADE -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.LEMONADE + " = " +
                            Drinks.LEMONADE.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.LEMONADE + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.LEMONADE.getPrice() + "$");
                        new Cooking().lemonadeReady();
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }

                case MOJITO -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.MOJITO + " = " +
                            Drinks.MOJITO.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.MOJITO + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.MOJITO.getPrice() + "$");
                        new Cooking().mojitoReady();
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }

                case COCA_COLA -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.COCA_COLA + " = " +
                            Drinks.COCA_COLA.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.COCA_COLA + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.COCA_COLA.getPrice() + "$");
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }
                case MINERAL_WATER -> {
                    System.out.println("You have chosen coffee. Price: " + Drinks.MINERAL_WATER.name() + " = " +
                            Drinks.MINERAL_WATER + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number > 0) {
                        System.out.println("Your order: " + Drinks.MINERAL_WATER + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.MINERAL_WATER.getPrice() + "$");
                    } else {
                        System.out.println("Invalid number of drinks entered");
                    }
                }
                default -> System.out.println("Enter the correct drink name!");
            }
            count = false;
        }
    }
}











