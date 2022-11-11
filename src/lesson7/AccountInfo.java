package lesson7;

public class AccountInfo {


    private final String name;
    private String surname;
    private final int birthDay;
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
        this.birthDay = birthday;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phone = phone;
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }

    //getAge
    public String getAge(int year) {
        int age = year - yearBirth;
        String strAge = Integer.toString(age);
        if (age < 18) {
            return "You are under 18";
        }
        return strAge;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSteps(long steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(name + " " + surname + ":" + "Age:" + getAge(2020) + "." + "Date of Birth " + birthDay + "." + monthBirth + "." +
                yearBirth + ". " + "E-mail:" + email + ". " + "Phone: " + phone + ". " + "Pressure:" + pressure + ". " + "Weight:" +
                weight + ". " + "Steps:" + steps);
    }
}


