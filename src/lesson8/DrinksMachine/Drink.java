package lesson8.DrinksMachine;

public enum Drink {

    COFFEE(0.3),
    TEA(0.15),
    LEMONADE(0.4),
    MOJITO(0.5),
    MINERAL_WATER(0.1),
    COCA_COLA(0.2);
    public final double price;

    Drink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}













