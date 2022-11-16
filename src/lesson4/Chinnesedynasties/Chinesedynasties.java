package lesson4.Chinnesedynasties;

public class Chinesedynasties {

    /**
     * For dominance in ancient China, two dynasties fought: Li and Ming.
     * Each side fought 3 types of warriors with the following attack values:
     *
     * Lee:
     * warrior - 13
     * archer - 24
     * top - 46
     *
     * Min:
     * warrior - 9
     * archer - 35
     * top - 12
     * Calculate: the total attack rate for both dynasties, if it is known that there were 860 warriors of the Li dynasty of each type, and the number of warriors of the Ming dynasty of each type is one and a half times more.
     * Print to the console the values of the total attack for each army
     */

    public static void main(String[] args) {

                int generalAttackOfLi = chineseDynasties(13, 24, 46, 860);
        int generalAttackOfMing = chineseDynasties(9, 35, 12, 860);
        System.out.println("General attack of the Li dynasty " + generalAttackOfLi);
        System.out.println("General attack of the Ming dynasty " + Math.round(generalAttackOfMing * 1.5));
    }

    public static int chineseDynasties(int attackIndexWarrior, int attackIndexArcher, int attackIndexRider, int warrior) {
        return warrior * (attackIndexWarrior + attackIndexArcher + attackIndexRider);
    }
}