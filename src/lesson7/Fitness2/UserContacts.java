package lesson7.Fitness2;

public class UserContacts extends UserDateBirth{
    private final String email;
    private final String phone;

    public UserContacts(String name, String surname, int birthDay, int monthBirth, int yearBirth, String email, String phone) {
        super(name, surname, birthDay, monthBirth, yearBirth);
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
