package lesson8.DrinksMachine;

import java.util.Arrays;

public class DrinkPrint {

    public void chooseOrder() {
        System.out.println("Choose a drink");
        System.out.println(Arrays.toString(Drink.values()));
    }

    public void chooseQuantity() {
        System.out.println("Select quantity: ");
    }

}
