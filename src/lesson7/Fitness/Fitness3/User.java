package lesson7.Fitness.Fitness3;

public class User {

    private final Identification identification;
    private final DateBirth dateBirth;
    private final Contacts contacts;
    private final HealthDiary healthDiary;

    public User(Identification identification, DateBirth dateBirth, Contacts contacts, HealthDiary healthDiary) {
        this.identification = identification;
        this.dateBirth = dateBirth;
        this.contacts = contacts;
        this.healthDiary = healthDiary;
    }

    public Identification getIdentification() {
        return identification;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public HealthDiary getHealthDiary() {
        return healthDiary;
    }
}




