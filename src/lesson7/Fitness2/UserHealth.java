package lesson7.Fitness2;

public class UserHealth extends UserContacts {
    private String pressure;
    private double weight;
    private long steps;
    private int age;

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

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getSteps() {
        return steps;
    }

    public void setSteps(long steps) {
        this.steps = steps;
    }

    public String getAge(int year) {
        age = year - getYearBirth();
        String strAge = Integer.toString(age);
        if (age < 18) {
            return "You are under 18";
        }
        return strAge;
    }
}

