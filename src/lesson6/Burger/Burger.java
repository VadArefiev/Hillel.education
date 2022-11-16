package lesson6.Burger;

//DTO
public class Burger {
    /**
     * Make a Burger class that will have fields:
     *  bun, meat, cheese, greens, mayonnaise
     * Make three constructors that will allow you to make three types of burgers:
     *  regular burger (all components)
     *  diet burger (no mayonnaise)
     *  with double meat
     *  In each constructor, add the output to the console of the composition of this variant of the burger
     *  (when creating an instance of a burger using this constructor, its composition will be displayed in the console).
     *  Make a BurgerMain class in which to create three different burgers.
     *  Their composition will be automatically displayed on the screen when the program starts.
     */

    public static void main(String[] args) {

        new Burger("bun", "green", "cheese",
                "mayo", false, "mainBurger");
        new Burger("bun", "green", "cheese",
                null, false, "dietBurger");
        new Burger("bun", "green", "cheese",
                "mayonnaise", true, "doubleMeatBurger");

    }


    public String getBun() {
        return bun;
    }


    private final String bun;
    private final String green;
    private final String cheese;
    private final String mayo;
    private final String name;
    /**
     * if <b>true</b> --> them number of meat = 2, else --> number of meat = 1
     */
    private final boolean isDoubleMeat;

    /**
     * @param bun          type of bun
     * @param green        type of grean
     * @param cheese       type of meat
     * @param mayo         type of mayo
     * @param isDoubleMeat type of isDoubleMeat.
     *                     User can choose number of meat with help of isDoubleMeat param
     */
    public Burger(String bun, String green, String cheese, String mayo, boolean isDoubleMeat, String name) {
        this.bun = bun;
        this.green = green;
        this.cheese = cheese;
        this.mayo = mayo;
        this.isDoubleMeat = isDoubleMeat;
        this.name = name;
        System.out.println(this);
    }

//create short toString and output in consol

    @Override
    public String toString() {
        String doubleMeat = isDoubleMeat ? "2" : "1";
        return name + "{" + "bun='" + bun + '\'' +
                ", green='" + green + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mayo='" + mayo + '\'' +
                ", isDoubleMeat=" + doubleMeat +
                '}';
     }
}







