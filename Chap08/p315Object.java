/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p315Object {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Logitech");
        Mouse m3 = m1;
        p314Keyboard k1 = new p314Keyboard("CHERRY");
        p314Keyboard k2 = new p314Keyboard("ABKO");

        System.out.println(m1.toString());
        System.out.println(m1);

        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(k1.equals(k2));
    }
}