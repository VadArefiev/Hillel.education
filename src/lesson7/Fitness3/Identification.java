package lesson7.Fitness3;

public class Identification {

    private final String name;
    private String surname;


    private DateBirth datebirth;

    public Identification(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\''+
                '}';
    }
}
