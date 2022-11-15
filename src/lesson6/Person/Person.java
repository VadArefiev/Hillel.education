package lesson6.Person;

public class Person {

    private String name;
    private String surname;
    private String city;
    private long phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String personInfo() {
        return "You can call a citizen " + name + " " + surname + " from the city " + city + " by number " + phone;
    }

    public String getName(String will) {
        return name;
    }
}



