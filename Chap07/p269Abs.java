/*
 * Code By OhYunTaek 2022.09.22(목)
 */

abstract class Shape {
    double pi = 3.14;

    abstract void draw();

    public double findArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("원을 그리다.");
    }

    public double findArea() {
        return pi * radius * radius;
    }
}

class Rectangle extends Shape {
    int ab;
    int bc;

    public Rectangle(int ab, int bc) {
        this.ab = ab;
        this.bc = bc;
    }

    public void draw() {
        System.out.println("네모를 그리다.");
    }

    public double findArea() {
        return ab * bc;
    }

}

class Starfish extends Shape {
    int abc;

    public Starfish(int abc) {
        this.abc = abc;
    }

    public void draw() {
        System.out.println("불가사리를 그리다.");
    }

    public double findArea() {
        return abc;
    }
}

public class p269Abs {
    public static void main(String[] args) {

        Circle c = new Circle(3);
        c.draw();
        System.out.printf("원의 넓이는 %.1f\n", c.findArea());

        Rectangle r = new Rectangle(3, 4);
        r.draw();
        System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());

        Starfish s = new Starfish(0);
        s.draw();
        System.out.printf("불가사리의 넓이는 구할 수 없다");
    }
}