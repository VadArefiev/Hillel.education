package lesson8.DrinksMachine;

import java.util.Scanner;

public class TotalCost {

    private double totalCost;

    public void costDrink(Drink drink) {
        Scanner chooseNumber = new Scanner(System.in);
        double amount = chooseNumber.nextInt();
        if (amount > 0) {
            switch (drink) {
                case COFFEE -> setTotalCost(amount * Drink.COFFEE.price);
                case TEA -> setTotalCost(amount * Drink.TEA.price);
                case MOJITO -> setTotalCost(amount * Drink.MOJITO.price);
                case LEMONADE -> setTotalCost(amount * Drink.LEMONADE.price);
                case MINERAL_WATER -> setTotalCost(amount * Drink.MINERAL_WATER.price);
                case COCA_COLA -> setTotalCost(amount * Drink.COCA_COLA.price);
            }
            System.out.println("Total cost order: " + "$" + getTotalCost());
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}



