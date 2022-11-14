package lesson8.DrinksMachine;

public class Cooking {

    private final String lime = "lime";
    private final String orange = "orange";
    private final String sparklingWater = "sparklingWater";
    private final String coffee = "coffee";
    private final String tea = "tea";

    private final String mint = "mint";
    private final String hotWater = "hotWater";
    private final String ice = "ice";

    private final String sugar = "sugar";


    public void coffeeReady() {
        System.out.println("Coffee preparation: " + new Cooking().hotWater + "+" + new Cooking().coffee);
    }

    public void teaReady() {
        System.out.println("Tea preparation: " + new Cooking().hotWater + "+" + new Cooking().tea);
    }

    public void mojitoReady() {
        System.out.println("Mojito preparation: " + new Cooking().lime + "+" +
                           new Cooking().sparklingWater + "+" + new Cooking().mint + "+" +
                           new Cooking().sugar + "+" + new Cooking().ice);
    }

    public void lemonadeReady() {

        System.out.println("Lemonade preparation: " + new Cooking().orange + "+" +
                            new Cooking().mint + "+" + new Cooking().ice + "+" +
                            new Cooking().sparklingWater + "+" + new Cooking().lime + "+" +
                            new Cooking().sugar);
    }

    public String getLime() {
        return lime;
    }

    public String getOrange() {
        return orange;
    }

    public String getSparklingWater() {
        return sparklingWater;
    }

    public String getCoffee() {
        return coffee;
    }

    public String getTea() {
        return tea;
    }

    public String getMint() {
        return mint;
    }

    public String getHotWater() {
        return hotWater;
    }

    public String getIce() {
        return ice;
    }

    public String getSugar() {
        return sugar;
    }
}











