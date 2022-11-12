package lesson7.Fitness3;

public class User {

    private final Identification identification;
    private final DateBirth dateBirth;
    private final Contacts contacts;
    private HealthDiary healthDiary;

    public User(Identification identification, DateBirth dateBirth, Contacts contacts, HealthDiary healthDiary) {
        this.identification = identification;
        this.dateBirth = dateBirth;
        this.contacts = contacts;
        this.healthDiary = healthDiary;

    }

    public String getAge(int year) {
        int age = year - dateBirth.getYearBirth();
        if (age < 18) {
            return "You are under 18";
        }
        return Integer.toString(age);
    }

    @Override
    public String toString() {
        return "User{" + "identification=" + identification + "," + "age=" + (getAge(2020)) +
                ", dateBirth=" + dateBirth +
                ", contacts=" + contacts +
                ", healthDiary=" + healthDiary +
                '}';
    }

    public void setHealthDiary(HealthDiary healthDiary) {
        this.healthDiary = healthDiary;
    }
}

