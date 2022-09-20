// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Triangle2 {
    private double bottom;
    private double height;

    public Triangle2(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public double findArea() {
        return bottom * height * 0.5;
    }

    public boolean abc(Triangle2 a) {
        if (a.findArea() == findArea())
            return true;
        else
            return false;
    }
}

public class p164ex2 {
    public static void main(String[] args) {
        Triangle2 x = new Triangle2(10.0, 5.0);
        Triangle2 y = new Triangle2(5.0, 10.0);
        Triangle2 z = new Triangle2(8.0, 8.0);

        System.out.println(x.abc(y));
        System.out.println(x.abc(z));
    }
}