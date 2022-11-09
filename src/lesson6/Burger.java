package lesson6;

//DTO
public class Burger {


    public static void main(String[] args) {

        new Burger("bun", "green", "cheese",
                "mayo", false, "mainBurger");
        new Burger("bun", "green", "cheese",
                null, false, "dietBurger");
        new Burger("bun", "green", "cheese",
                "mayonnaise", true, "doubleMeatBurger");

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







