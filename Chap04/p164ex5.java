// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Line1 {

    private int length;

    public Line1(int length) {
        this.length = length;
    }

    public boolean isSameLine(Line1 line1) {
        if (length == line1.length)
            return true;
        else
            return false;
    }
}

public class p164ex5 {
    public static void main(String[] args) {
        Line1 a = new Line1(1);
        Line1 b = new Line1(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
