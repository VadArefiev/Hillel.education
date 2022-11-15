package lesson7.Fitness.Fitness1;

public class FitnessMain {

    public static void main(String[] args) {

        new AccountInfo("Max", "Doroshenko", 13, 4, 1985,
                "max@gmail.com", "097-948-99-44",
                "120/70", 86, 3000).printAccountInfo();
        new AccountInfo("Vadim", "Galushka", 18, 11, 1985,
                "vadim@gmail.com", "068-888-84-94",
                "130/80", 81, 9000).printAccountInfo();
        new AccountInfo("Sergey", "Pulavskiy", 26, 8, 1985,
                "sergey@gmail.com", "091-300-86-68",
                "110/80", 89, 7000).printAccountInfo();
        AccountInfo roman = new AccountInfo("Roman", "Kiyas", 13, 12, 1980,
                "roman@gmail.com", "067-767-23-46",
                "140/70", 83, 4000);
        AccountInfo tatyana = new AccountInfo("Tatyana", "Belan", 11, 5, 2010,
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





