package lesson7.Fitness.Fitness3;

public class Main {

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