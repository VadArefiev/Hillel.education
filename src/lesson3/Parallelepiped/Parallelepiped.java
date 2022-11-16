package lesson3.Parallelepiped;

import java.util.Scanner;

public class Parallelepiped {
    /**
     * create a main method in a new class;
     * create three variables to store the sides of the box;
     * Calculate the volume in the volume variable;
     * Display the variable volume as follows:
     * System.out.println("Box volume = "+ volume);
     * Calculate the total length of all sides in the length variable and display it on the screen;
     * Attach a .java file with your homework to your home;
     * The .java file is on the path: project folder -> src -> your_package_name -> MyApp.java where MyApp is the name of your class/file
     */
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

