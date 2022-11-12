package lesson7.Fitness3;

public class DateBirth {

    private final int birthDay;
    private final int monthBirth;
    private final int yearBirth;

    public DateBirth(int birthDay, int monthBirth, int yearBirth) {
        this.birthDay = birthDay;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    @Override
    public String toString() {
        return "DateBirth{" +
                "birthDay=" + birthDay +
                ", monthBirth=" + monthBirth +
                ", yearBirth=" + yearBirth +
                '}';
    }
}
