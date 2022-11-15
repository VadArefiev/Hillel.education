package lesson8.DrinksMachine;

public enum CookingMethods {
    ORANGE("orange"),
    SPARKLING_WATER("sparklingWater"),
    COFFEE("coffee"),
    TEA("tea"),
    MINT("mint"),
    HOT_WATER("hot_water"),
    ICE("ice"),
    SUGAR("sugar"),
    LIME("lime");

    CookingMethods(String name) {
    }

    public static void coffeeReady() {
        System.out.println("Coffee preparation: " + CookingMethods.HOT_WATER + "+" + CookingMethods.COFFEE);
    }

    public static void teaReady() {
        System.out.println("Tea preparation: " + CookingMethods.HOT_WATER + "+" + CookingMethods.TEA);
    }

    public static void mojitoReady() {
        System.out.println("Mojito preparation: " + CookingMethods.LIME + "+" +
                CookingMethods.SPARKLING_WATER + "+" + CookingMethods.MINT + "+" +
                CookingMethods.SUGAR + "+" + CookingMethods.ICE);
    }

    public static void lemonadeReady() {

        System.out.println("Lemonade preparation: " + CookingMethods.ORANGE + "+" +
                CookingMethods.MINT + "+" + CookingMethods.ICE + "+" +
                CookingMethods.SPARKLING_WATER + "+" + CookingMethods.LIME + "+" +
                CookingMethods.SUGAR);
    }
}










