package lesson6.Person;

public class PersonMain {

    /**
     *  Make the Person class and the personInfo() method in it
     * At the input, pass four parameters to it: first name, last name, garden, phone
     * Inside the method, form the term in the format:
     * You can call a citizen + NAME SURNAME + from the city + CITY by number + TELEPHONE
     * The method must return.
     * In the main method, make three calls to the personInfo method, each time passing in a new person;
     * You should get output like this:
     * You can call citizen Will Smith from New York at 2936729462846.
     * You can call citizen Jackie Chan from Shanghai at 12312412412.
     * You can call a citizen of Sherlock Holmes from London at 37742123513.
     * */

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














