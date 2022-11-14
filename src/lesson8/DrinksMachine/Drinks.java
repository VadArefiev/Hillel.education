package lesson8.DrinksMachine;

public enum Drinks {

    COFFEE(0.3),
    TEA(0.1),
    LEMONADE(0.4),
    MOJITO(0.5),
    MINERAL_WATER(0.1),
    COCA_COLA(0.2);

    public final double price;

    Drinks(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }





}









