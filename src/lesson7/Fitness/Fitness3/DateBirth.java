package lesson7.Fitness.Fitness3;

public class DateBirth {

    private final int birthDay;
    private final int monthBirth;
    private final int yearBirth;

    public DateBirth(int birthDay, int monthBirth, int yearBirth) {
        this.birthDay = birthDay;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }

    public String calculateAge(int year) {
        int age = year - yearBirth;
        String strAge = Integer.toString(age);
        if (age < 18) {
            return "You are under 18";
        }
        return strAge;
    }

    @Override
    public String toString() {
        return "DateBirth{" +
                "birthDay=" + birthDay +
                ", monthBirth=" + monthBirth +
                ", yearBirth=" + yearBirth +
                ", Age=" + calculateAge(2020) +
                '}';
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


