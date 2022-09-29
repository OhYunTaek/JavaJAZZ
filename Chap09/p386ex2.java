/*
 * Code By OhYunTaek 2022.09.29(목)
 */
class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class p386ex2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("예외 발생!");
        }
    }

    static void casting(Shape s) {
        Circle c = (Circle) s;
    }
}