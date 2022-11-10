package lesson7;

public class AccountInfo {


    private final String name;
    private String surname;
    private final int birthday;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String phone;
    private String pressure;
    private double weight;
    private long steps;

    public AccountInfo(String name, String surname, int birthday, int monthBirth, int yearBirth,
                       String email, String phone, String pressure, double weight, long steps) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phone = phone;
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }
    public void printAccountInfo() {
       System.out.println(name + " " + surname + ":" + "Date of Birth " + birthday + "." + monthBirth + "." +
                          yearBirth + ". " + "E-mail:" + email + ". " + "Phone: " + phone + ". " + "Pressure:" + pressure + ". " + "Weight:" +
                           weight + ". " + "Steps:" + steps);

    }
}


