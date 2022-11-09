package lesson5;

public class NumberShuttles {
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




