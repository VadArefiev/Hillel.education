package lesson7.Fitness.Fitness3;

public class FitnessMain {

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

        User max = new User(new Identification("Max", "Doroshenko"),
                new DateBirth(13, 4, 1985),
                new Contacts("max@gmail.com", "097-948-99-44"),
                new HealthDiary("120/70", 86, 3000));
        User vadim = new User(new Identification("Vadim", "Galushka"),
                new DateBirth(18, 11, 1985),
                new Contacts("vadim@gmail.com", "068-888-84-94"),
                new HealthDiary("130/80", 81, 9000));
        User sergey = new User(new Identification("Sergey", "Pulavskiy"),
                new DateBirth(26, 8, 1985),
                new Contacts("sergey@gmail.com", "091-300-86-68"),
                new HealthDiary("110/80", 89, 7000));
        User roman = new User(new Identification("Roman", "Kiyas"),
                new DateBirth(13, 12, 1980),
                new Contacts("roman@gmail.com", "067-767-23-46"),
                new HealthDiary("140/70", 83, 4000));
        User tatyana = new User(new Identification("Tatyana", "Belan"),
                new DateBirth(11, 5, 2010),
                new Contacts("tatyana@gmail.com", "093-330-63-00"),
                new HealthDiary("120/75", 50, 2000));

        UserConsolePrinter.printUsers(new User[]{max, vadim, sergey, roman, tatyana});
        roman.getHealthDiary().setPressure("150/90");
        roman.getHealthDiary().setWeight(88);
        UserConsolePrinter.printUsers(new User[]{roman});

        tatyana.getHealthDiary().setPressure("150/90");
        tatyana.getHealthDiary().setWeight(88);
        UserConsolePrinter.printUsers(new User[]{tatyana});
    }
}
