/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
class Circle6 {
    double radius;
    // int를 추가해본다
    int radius2;
    // long을 추가해본다
    long radius3;
    // float을 추가해본다
    float radius4;

    public Circle6(double radius) {
        this.radius = radius;
    }
}

public class p193 {
    public static void main(String[] argw) {
        Circle6 cc1 = new Circle6(10.0);
        Circle6 cc2 = new Circle6(10.0);
        Circle6 cc3 = new Circle6(10.0);
        Circle6 cc4 = new Circle6(10.0);
        Circle6 cc5 = new Circle6(10.5);

        zero(cc1);
        System.out.println("원(cc1)의 반지름 : " + cc1.radius);

        zero(cc2.radius);
        System.out.println("원(cc2)의 반지름 : " + cc2.radius);
        // int를 추가해본다
        zero(cc3.radius2);
        System.out.println("원(cc3)의 반지름 : " + cc3.radius2);
        // long을 추가해본다
        zero(cc4.radius3);
        System.out.println("원(cc4)의 반지름 : " + cc4.radius3);
        // float을 추가해본다
        zero(cc5.radius4);
        System.out.println("원(cc5)의 반지름 : " + cc5.radius4);
    }

    public static void zero(Circle6 cc) {
        cc.radius = 0.0;
    }

    public static void zero(double r) {
        r = 0.0;
    }

    // int를 추가해본다
    public static void zero(int i) {
        i = 0;
    }

    // long을 추가해본다
    public static void zero(long l) {
        l = 0L;
    }

    // float을 추가해본다
    public static void zero(float f) {
        f = 0.0F;
    }
}