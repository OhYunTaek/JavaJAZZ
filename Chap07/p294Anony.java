/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class p294Anony {
    public static void main(String[] args) {
        p291Bird b = new p291Bird() {
            public void move() {
                System.out.println("독수리가 난다~");
            }
        };

        b.move();
    }
}