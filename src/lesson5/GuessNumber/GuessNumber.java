package lesson5.GuessNumber;

import java.util.Scanner;

public class GuessNumber {

   /**
    * Make a game in which you need to guess the integer that the computer "guessed" in the range from 0 to 10
    *  The user should be able to guess multiple attempts (minimum 3).
    */

    public static void main(String[] args) {
        int range = 10;
        int rand = (int) (Math.random() * range);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess an number between 0 to " + range);
        for (int i = 0; i < 3; i++) {
            int inputNumber = scanner.nextInt();
            if (rand < inputNumber) {
                System.out.println("The number entered is greater than the guess number");
            } else if (rand > inputNumber) {
                System.out.println("The entered number is less than the guess number");
            } else {
                System.out.println("Congratulations, you guessed right");
            }
        }
    }
}








