package p278;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

public class TV implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("TV를 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끈다");
    }
}