package lesson8.DrinksMachine;

import com.sun.source.tree.NewArrayTree;

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

                case COFFEE:
                    System.out.println("You have chosen coffee. Price: " + Drinks.COFFEE + " = " +
                            Drinks.COFFEE.getPrice() + "$");
                    System.out.println("Select quantity: ");
                    Scanner chooseNumber = new Scanner(System.in);
                    number = chooseNumber.nextInt();
                    if (number < 0) {
                        System.out.println("Invalid number of drinks entered");
                    }
                        System.out.println("Your order: " + Drinks.COFFEE + "-" + number);
                        System.out.println("Total cost order: " + number * Drinks.COFFEE.getPrice());
                        new Cooking().coffeeReady();
                        break;
                    }
                    count = false;
            }
        }
    }










//                case TEA:
//                    new TotalCost().chooseNumb();
//                    new Cooking().coffeeReady();
//                    break;
//                case LEMONADE:
//                    System.out.println("You have chosen lemonade. Price: " + Drinks.LEMONADE);
//                    System.out.println("Total cost order: " + Drinks.LEMONADE.getPrice());
//                    new Cooking().lemonadeReady();
//                    break;
//                case MOJITO:
//                    System.out.println("You have chosen Mojito. Price: " + Drinks.MOJITO);
//                    System.out.println("Total cost order: " + Drinks.MOJITO.getPrice());
//                    new Cooking().mojitoReady();
//                    break;
//                case COCA_COLA:
//                    System.out.println("You have chosen Coca-Cola. Price: " + Drinks.COCA_COLA);
//                    System.out.println("Total cost order: " + Drinks.COCA_COLA.getPrice());
//                    break;
//                case MINERAL_WATER:
//                    System.out.println("You have chosen Mineral_Water. Price: " + Drinks.MINERAL_WATER);
//                    System.out.println("Total cost order: " + Drinks.MINERAL_WATER.getPrice());
//                    break;
//                default:
//                    System.out.println("Enter the correct drink name!");
//                    break;
//            }
//            count=false;
//        }
//    }


//            Scanner chooseNumber = new Scanner(System.in);
//            int number = chooseNumber.nextInt();
//            if (number > 0) {
//                System.out.println(chooseNumber.nextInt());
//            } else {
//                System.out.println("Invalid number of drinks entered");




