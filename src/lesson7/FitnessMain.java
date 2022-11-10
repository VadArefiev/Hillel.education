package lesson7;

public class FitnessMain {

    public static void main(String[] args) {

        AccountInfo maxDoroshenko = new AccountInfo("Max", "Doroshenko", 13, 4, 1985,
                "max@gmail.com", "097-948-99-44",
                "120/70", 86, 3000);
        AccountInfo vadimGalushka = new AccountInfo("Vadim", "Galushka", 18, 11, 1985,
                "vadim@gmail.com", "068-888-84-94",
                "130/80", 81, 9000);
        AccountInfo sergeyPulavskiy = new AccountInfo("Sergey", "Pulavskiy", 26, 8, 1985,
                "sergey@gmail.com", "091-300-86-68",
                "110/80", 89, 7000);

        maxDoroshenko.printAccountInfo();
        vadimGalushka.printAccountInfo();
        sergeyPulavskiy.printAccountInfo();
    }
}





