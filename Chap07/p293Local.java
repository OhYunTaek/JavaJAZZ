/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class p293Local {
    public static void main(String[] args) {
        class Eagle extends p291Bird {
            public void move() {
                System.out.println("독수리가 난다~");
            }
        }

        p291Bird e = new Eagle();
        e.move();
    }
}