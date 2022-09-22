package p278;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

public class p278Controll {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer(),
                new Nintendo() };

        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}