package lesson11.Interface;

public class Android implements Smartphone, LinuxOS {

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Hello,you are using Android");
    }

    @Override
    public void Internet() {
        System.out.println("Internet works on android");
    }

}

