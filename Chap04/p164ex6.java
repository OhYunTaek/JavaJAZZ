// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Complex1 {

    private double num;
    private double num1;

    public Complex1(double num) {
        this.num = num;
    }

    public Complex1(double num, double num1) {
        this.num = num;
        this.num1 = num1;
    }

    public void print() {
        System.out.println(num + " + " + num1 + "i");
    }
}

public class p164ex6 {
    public static void main(String[] args) {
        Complex1 c1 = new Complex1(2.0);
        c1.print();
        Complex1 c2 = new Complex1(1.5, 2.5);
        c2.print();
    }
}
