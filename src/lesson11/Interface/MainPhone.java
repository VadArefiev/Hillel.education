package lesson11.Interface;

public class MainPhone {

    /**
     * Make a Smartphones interface which should contain call(), sms(), internet() methods
     * Make classes that implement it: Androids, iPhones.
     * Androids must also implement LinuxOS, iPhones in turn must implement iOS
     * Create instances of each view in the main class
     */

    public static void main(String[] args) {

        SmartphoneUsing android = new Android();
        Iphone iphone = new Iphone();

        phoneUse(android);
        phoneUse(iphone);
    }

    public static void phoneUse(SmartphoneUsing smartphoneUsing) {
        smartphoneUsing.sms();
        smartphoneUsing.call();
        smartphoneUsing.Internet();
    }
}

