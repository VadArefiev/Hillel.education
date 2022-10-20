package lesson3;

public class Chinesedynasties {
    public static void main(String[] args) {
        int generalAttackOfLi = chineseDynasties(13, 24, 46, 860);
        int generalAttackOfMing = chineseDynasties(9, 35, 12, 860);
        System.out.println("General attack of the Li dynasty " + generalAttackOfLi);
        System.out.println("General attack of the Ming dynasty " + generalAttackOfMing * 1.5);
    }

    public static int chineseDynasties(int attackIndexWarrior, int attackIndexArcher, int attackIndexRider, int warrior) {
        return warrior * (attackIndexWarrior + attackIndexArcher + attackIndexRider);
    }
}