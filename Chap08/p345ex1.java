/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(3);
        Circle1 c2 = new Circle1(3);

        if (c1.equals(c2))
            System.out.println("c1과 c2는 같다");
        else
            System.out.println("c1과 c2는 다르다");
    }
}

class Circle1 {
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public boolean equals(Circle1 c) {
        return this.radius == c.radius;
    }
}