package lesson3.Parallelepiped;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side ");

        int firstSide = scanner.nextInt();
        System.out.println("Enter the second side ");
        int secondSide = scanner.nextInt();
        System.out.println("Enter the third side ");
        int thirdSide = scanner.nextInt();
        int volume = firstSide*secondSide*thirdSide;
        System.out.println("Volume of the parallelepiped = "+ volume);
        int length = 4*(firstSide+secondSide+thirdSide);
        System.out.println("The length of all sides of the parallelepiped = "+ length);
    }
}

