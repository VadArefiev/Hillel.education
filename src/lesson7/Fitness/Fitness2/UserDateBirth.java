package lesson7.Fitness.Fitness2;

public class UserDateBirth extends UserName {
    private final int birthDay;
    private final int monthBirth;
    private final int yearBirth;
    private int age;


    public UserDateBirth(String name, String surname, int birthDay, int monthBirth, int yearBirth) {
        super(name, surname);
        this.birthDay = birthDay;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }


    public int getBirthDay() {
        return birthDay;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    //made a restriction for the age of up to 18 years
    public String getAge(int year) {
        age = year - getYearBirth();
        String strAge = Integer.toString(age);
        if (age < 18) {
            return "You are under 18";
        }
        return strAge;
    }
}
