package lesson7.Fitness2;

public class UserHealth extends UserContacts {
    private String pressure;
    private double weight;
    private long steps;

    public UserHealth(String name, String surname, int birthDay, int monthBirth, int yearBirth, String email, String phone, String pressure, double weight, long steps) {
        super(name, surname, birthDay, monthBirth, yearBirth, email, phone);
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(getName() + " " + getSurname() + ":" + "Age:" + getAge(2020) + "." + "Date of Birth " + getBirthDay() + "." + getMonthBirth() + "." +
                getYearBirth() + ". " + "E-mail:" + getEmail() + ". " + "Phone: " + getPhone() + ". " + "Pressure:" + pressure + ". " + "Weight:" +
                weight + ". " + "Steps:" + steps);
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
}

