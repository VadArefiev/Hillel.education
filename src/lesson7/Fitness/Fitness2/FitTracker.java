package lesson7.Fitness.Fitness2;

public class FitTracker {

    /**
     * Make a program for a fitness tracker that will register a new user by creating an account for him, taking the following parameters:
     * Immutable (set only when creating an account and can only be obtained using getters):
     *  Name
     *  Date of birth (separate day, month, year)
     *  Email
     *  Telephone
     * Changeable:
     *  Surname
     *  The weight
     *  Pressure
     *  Number of steps taken per day
     * You need to create each user through the constructor, taking all the fields as the input of the constructor.
     * Add the printAccountInfo() method, when called, print all user data
     * After receiving the year, calculate the user's age into the internal variable age (just starting from 2020, we will not complicate it here), for which we will only make a getter and display it along with the rest of the fields in the printAccountInfo() method; do not use console output in constructor or getters/setters
     * In the main class, create 3-5 users and print the data of each caller of the printAccountInfo() method; for two users to change several fields and reprint the new data
     */

    public static void main(String[] args) {
        new UserHealth("Max", "Doroshenko", 13, 4, 1985,
                "max@gmail.com", "097-948-99-44",
                "120/70", 86, 3000).printAccountInfo();
        new UserHealth("Vadim", "Galushka", 18, 11, 1985,
                "vadim@gmail.com", "068-888-84-94",
                "130/80", 81, 9000).printAccountInfo();
        new UserHealth("Sergey", "Pulavskiy", 26, 8, 1985,
                "sergey@gmail.com", "091-300-86-68",
                "110/80", 89, 7000).printAccountInfo();
        UserHealth roman = new UserHealth("Roman", "Kiyas", 13, 12, 1980,
                "roman@gmail.com", "067-767-23-46",
                "140/70", 83, 4000);
        UserHealth tatyana = new UserHealth("Tatyana", "Belan", 11, 5, 2010,
                "tatyana@gmail.com", "093-330-63-00",
                "120/75", 50, 2000);

        roman.printAccountInfo();
        roman.setSurname("Pavlov");
        roman.setPressure("130/90");
        roman.setSteps(6000);
        roman.setWeight(80);
        roman.printAccountInfo();

        tatyana.printAccountInfo();
        tatyana.setSurname("Kovaleva");
        tatyana.setPressure("110/80");
        tatyana.setSteps(4000);
        tatyana.setWeight(60);
        tatyana.printAccountInfo();

     }
}
