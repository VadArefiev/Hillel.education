package lesson6;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Will");
        person.setSurname("Smith");
        person.setCity("New York");
        person.setPhone(2936729462846L);
        System.out.println(person.personInfo());

        Person person2 = new Person();
        person2.setName("Jackie");
        person2.setSurname("Chan");
        person2.setCity("Shanghai");
        person2.setPhone(12312412412L);
        System.out.println(person2.personInfo());

        Person person3 = new Person();
        person3.setName("Sherlock");
        person3.setSurname("Holmes");
        person3.setCity("London");
        person3.setPhone(37742123513L);
        System.out.println(person3.personInfo());
    }
}














