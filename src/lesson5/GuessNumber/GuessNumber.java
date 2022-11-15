package lesson5.GuessNumber;

import java.util.Scanner;

public class GuessNumber {
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








