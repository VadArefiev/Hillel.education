package lesson8.DrinksMachine;

import java.util.Scanner;

public class TotalCost {

    private double totalCost;

    public void costDrink(Drink drink) {
        Scanner chooseNumber = new Scanner(System.in);
        if (chooseNumber.nextInt() > 0) {
            switch (drink) {
                case COFFEE -> setTotalCost(chooseNumber.nextInt() * Drink.COFFEE.price);
                case TEA -> setTotalCost(chooseNumber.nextInt() * Drink.TEA.price);
                case MOJITO -> setTotalCost(chooseNumber.nextInt() * Drink.MOJITO.price);
                case LEMONADE -> setTotalCost(chooseNumber.nextInt() * Drink.LEMONADE.price);
                case MINERAL_WATER -> setTotalCost(chooseNumber.nextInt() * Drink.MINERAL_WATER.price);
                case COCA_COLA -> setTotalCost(chooseNumber.nextInt() * Drink.COCA_COLA.price);
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



