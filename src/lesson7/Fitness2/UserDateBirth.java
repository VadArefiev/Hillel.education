package lesson7.Fitness2;

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
}
