/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p360TryCatch4 {
    public static void main(String[] args) {
        Reso reso = new Reso();

        try (reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}

class Reso implements AutoCloseable {
    void show() {
        System.out.println("자원 사용");
    }

    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}