package p278;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class Nintendo implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("닌텐도를 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("닌텐도를 끈다");
    }
}