package lesson11.Interface;

public class Iphone implements Smartphone, IOS {

    @Override
    public void call() {
        System.out.println("Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("Hello,you are using Iphone");
    }

    @Override
    public void Internet() {
        System.out.println("Internet works on Iphone");
    }
}
