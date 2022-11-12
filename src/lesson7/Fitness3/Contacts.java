package lesson7.Fitness3;

public class Contacts {

    private final String email;
    private final String phone;

    public Contacts(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
