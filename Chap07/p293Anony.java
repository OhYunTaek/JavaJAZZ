/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class p293Anony {
    p291Bird e = new p291Bird() {
        public void move() {
            System.out.println("독수리가 난다~");
        }

        void sound() {
            System.out.println("독수~독수~");
        }
    };

    public static void main(String[] args) {
        p293Anony a = new p293Anony();
        a.e.move();
        // a.e.sound();
        // a,e객체가 Bird 타입이라서 sound() 메서드를 호출할 수 없다
    }
}