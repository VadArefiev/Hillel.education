package lesson8.DrinksMachine;

import java.util.Arrays;

public class DrinkPrint {

    public void chooseOrder() {
        System.out.println("Choose a drink: ");
    }

    public void chooseQuantity() {
        System.out.println("Select quantity: ");
    }

    public void priceDrink() {
        for (Drink drink : Drink.values()) {
            System.out.print(drink + "=" + "$");
            switch (drink) {
                case COFFEE -> System.out.println(Drink.COFFEE.price);
                case TEA -> System.out.println(Drink.TEA.price);
                case LEMONADE -> System.out.println(Drink.LEMONADE.price);
                case MOJITO -> System.out.println(Drink.MOJITO.price);
                case COCA_COLA -> System.out.println(Drink.COCA_COLA.price);
                case MINERAL_WATER -> System.out.println(Drink.MINERAL_WATER.price);
            }
        }
        System.out.println();
    }
}
