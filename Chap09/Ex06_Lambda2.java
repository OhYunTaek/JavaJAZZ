/*
 * Code By OhYunTaek 2022.09.29(목)
 */
interface Unit6 {
    void move(String s);
}

public class Ex06_Lambda2 {

    public static void main(String[] args) {
        Unit6 unit = new Unit6() {
            public void move(String s) {
                System.out.println(s);
            }
        };
        unit.move("anonymous : Unit 6");
    }
}