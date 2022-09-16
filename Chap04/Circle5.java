// /*
//  * Code by OhYunTaek. 2022.09.16(금) 
//  */

class YunTaek {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public YunTaek(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}

public class Circle5 {
    public static void main(String[] args) {
        YunTaek myCircle = new YunTaek(10.0);
        YunTaek yourCircle = new YunTaek(5.0);

        // 프린트();
        System.out.println("원의 개수 : " + YunTaek.numOfCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }

    void print() {
        System.out.println("인스턴스 메서드다");
    }
}