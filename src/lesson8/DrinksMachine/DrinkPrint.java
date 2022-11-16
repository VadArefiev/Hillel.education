package lesson8.DrinksMachine;

public class DrinkPrint {

    public void chooseOrder() {
        System.out.println("Choose a drink: ");
    }

    public void chooseQuantity() {
        System.out.println("Select quantity: ");
    }

    public void priceDrink() {
        for (Drink drink : Drink.values()) {
            System.out.print(drink + "=" + " " + drink.getPrice() + "," +  "$" );
        }
        System.out.println();
    }
}
