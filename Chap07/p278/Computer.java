package p278;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class Computer implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끈다");
    }
}