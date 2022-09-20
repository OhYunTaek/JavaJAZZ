// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Triangle1 {
    private double bottom;
    private double height;

    public Triangle1(double bottom, double height) {
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
}

public class p164ex1 {
    public static void main(String[] args) {
        Triangle1 a = new Triangle1(10.0, 5.0);
        System.out.println(a.findArea());
    }
}