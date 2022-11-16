package lesson5.NumberShuttles;

public class NumberShuttles {

    /**
     *  In Japan, the numbers 4 and 9 are considered unlucky.
     *  You need to number 100 space shuttles to transport people to Mars so that there are no unlucky numbers in the shuttle numbers.
     *  Write a function that displays all the numbers of such shuttles.
     */

    public static void main(String[] args) {
        int numberShuttles = 0;
        int count = 0;
        int shuttle;
        System.out.println("All lucky shuttle numbers:");
        while (numberShuttles < 100) {
            shuttle = count++;
            String str = String.valueOf(shuttle);
            if ((str.contains("4") || str.contains("9"))) {
                continue;
            }
            numberShuttles++;
            System.out.println("NumberShuttle " + str);
        }
    }
}




