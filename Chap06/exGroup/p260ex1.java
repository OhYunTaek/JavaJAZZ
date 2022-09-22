package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

class Circle1 {
    public int radius;

    public void show() {
        System.out.println("반지름이 " + radius + "인 원이다");
    }

    public Circle1(int radius) {
        this.radius = radius;
    }
}

class ColoredCircle1 extends Circle1 {
    public String color;

    public void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다");
    }

    public ColoredCircle1(int radius, String color) {
        super(radius);
        this.color = color;
    }
}

public class p260ex1 {
    public static void main(String[] args) {
        Circle1 a1 = new Circle1(5);
        ColoredCircle1 a2 = new ColoredCircle1(10, "마젠타색");

        a1.show();
        a2.show();
    }
}