package lesson8.DrinksMachine;

import java.util.Arrays;

public class DrinkPrint {

    public void chooseOrder() {
        System.out.println("Choose a drink: ");
//        System.out.println(Arrays.toString(Drink.values()));
    }

    public void chooseQuantity() {
        System.out.println("Select quantity: ");
    }

    public void priceDrink() {
        for (Drink drink : Drink.values()) {
            System.out.print(drink + "," + new Drink().getPrice());
        }
        System.out.println();
    }
}
