/*
 * Code By OhYunTaek 2022.09.21(수)
 */
public class p218IceBall2 extends p218IceBall {
    private String color;

    public p218IceBall2(String color) {
        this.color = color;
    }

    protected void findColor() {
        System.out.println(color + " 색 얼음구체이다");
    }

    public void findArea() {
        findRadius();

        super.findArea();

        System.out.println("넓이는 4*(3.14*반지름*반지름)이다");
    }

    public void findVolume() {
        System.out.println("부피는 4/3*(3.14*반지름*반지름*반지름)이다");
    }
}