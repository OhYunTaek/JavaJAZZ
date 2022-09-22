/*
 * Code By OhYunTaek 2022.09.21(수)
 */
public class p218IceBall3 {
    public static void main(String[] args) {
        p218IceBall b1 = new p218IceBall();
        p218IceBall2 b2 = new p218IceBall2("파랑");

        System.out.println("사이즈 : ");
        b1.findRadius();
        b1.findArea();

        System.out.println("\n아이스 볼 : ");
        b2.findRadius();
        b2.findColor();
        b2.findArea();
        b2.findVolume();
    }
}