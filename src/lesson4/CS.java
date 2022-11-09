package lesson4;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        String team1 = "Terrorists";
        String team2 = "Counter-Terrorists";
        int numberPlayersTerror = 5;
        int numberGamersCounterTerror = 5;
        Scanner fragsTerrorists = new Scanner(System.in);
        System.out.println("Enter the number of frags the first player has ");
        int firstPlayer = fragsTerrorists.nextInt();
        System.out.println("Enter the number of frags the second player has ");
        int secondPlayer = fragsTerrorists.nextInt();
        System.out.println("Enter the number of frags the third player has ");
        int thirdPlayer = fragsTerrorists.nextInt();
        System.out.println("Enter the number of frags the fourth player has ");
        int fourthPlayer = fragsTerrorists.nextInt();
        System.out.println("Enter the number of frags the fifth player has ");
        int fifthPlayer = fragsTerrorists.nextInt();
        int sumFragsTerror = firstPlayer + secondPlayer + thirdPlayer + fourthPlayer + fifthPlayer;
        int averageFragsTerror = (sumFragsTerror / numberPlayersTerror);

        Scanner fragsCounterTerrorists = new Scanner(System.in);
        System.out.println("Enter the number of frags the first gamer has ");
        int firstGamer = fragsCounterTerrorists.nextInt();
        System.out.println("Enter the number of frags the second gamer has ");
        int secondGamer = fragsCounterTerrorists.nextInt();
        System.out.println("Enter the number of frags the third gamer has ");
        int thirdGamer = fragsCounterTerrorists.nextInt();
        System.out.println("Enter the number of frags the fourth gamer has ");
        int fourthGamer = fragsCounterTerrorists.nextInt();
        System.out.println("Enter the number of frags the fifth gamer has ");
        int fifthGamer = fragsCounterTerrorists.nextInt();
        int sumFragsCounterTerror = firstGamer + secondGamer + thirdGamer + fourthGamer + fifthGamer;
        int averageFragsCounterTerror = (sumFragsCounterTerror / numberGamersCounterTerror);

        if (averageFragsTerror > averageFragsCounterTerror) {
            System.out.println(team1 + " team won " + "who scored " + averageFragsCounterTerror + " points");
        } else if (averageFragsTerror < averageFragsCounterTerror) {
            System.out.println(team2 + " team won " + "who scored " + averageFragsCounterTerror + " points");
        } else {
            System.out.println("Number of points " + team1 + " = " + team2);
        }
    }
}