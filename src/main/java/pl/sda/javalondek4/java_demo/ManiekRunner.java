package pl.sda.javalondek4.java_demo;

public class ManiekRunner implements Runner {

    @Override
    public void go() {
        System.out.println("Run maniek, run!!!");
    }

    @Override
    public void go(int speed) {
        System.out.println("Czarek speed is" + speed);
    }

    public void walk() {
        System.out.println("walk maniek...");
    }
}