package lesson11.Interface;

public class MainPhone {

    /**
     * Make a Smartphones interface which should contain call(), sms(), internet() methods
     * Make classes that implement it: Androids, iPhones.
     * Androids must also implement LinuxOS, iPhones in turn must implement iOS
     * Create instances of each view in the main class
     */

    public static void main(String[] args) {

        phoneUse(new Android());
        phoneUse(new Iphone());
    }

    public static void phoneUse(Smartphone smartphone) {
        smartphone.sms();
        smartphone.call();
        smartphone.Internet();
    }
}

