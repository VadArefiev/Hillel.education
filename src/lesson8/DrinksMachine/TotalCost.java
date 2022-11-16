package lesson8.DrinksMachine;

import java.util.Scanner;

public class TotalCost {

    private int number;
    private double totalCost;

    public void costDrink(Drink drink) {
        Scanner chooseNumber = new Scanner(System.in);
        if (chooseNumber.nextInt() > 0) {
            switch (drink) {
                case COFFEE -> totalCost = chooseNumber.nextInt() * Drink.COFFEE.price;
                case TEA -> totalCost = chooseNumber.nextInt() * Drink.TEA.price;
                case MOJITO -> totalCost = chooseNumber.nextInt() * Drink.MOJITO.price;
                case LEMONADE -> totalCost = chooseNumber.nextInt() * Drink.LEMONADE.price;
                case MINERAL_WATER -> totalCost = chooseNumber.nextInt() * Drink.MINERAL_WATER.price;
                case COCA_COLA -> totalCost = chooseNumber.nextInt() * Drink.COCA_COLA.price;
            }
            System.out.println("Total cost order: " + "$" + totalCost);
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}