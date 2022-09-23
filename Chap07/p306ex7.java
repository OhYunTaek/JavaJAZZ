/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p306ex7 {
    public static void main(String[] args) {
        Flyable f = new Flyable() {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}

interface Flyable {
    void speed();

    void height();
}