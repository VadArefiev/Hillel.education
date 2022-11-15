package lesson7.Fitness.Fitness3;

public class UserConsolePrinter {

    public static void printUser(User user) {

        System.out.println(user.getIdentification() + " " + user.getDateBirth() + " " +
                user.getContacts() + " " + user.getHealthDiary());

    }

    public static void printUsers(User[] user) {
        for (int i = 0; i < user.length; i++) {
            printUser(user[i]);
        }
    }
}
