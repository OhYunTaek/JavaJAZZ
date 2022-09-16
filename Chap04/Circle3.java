/*
 * Code by OhYunTaek. 2022.09.16(금) 
 */

//getter와 setter 연습

// 클래스 선언
class Circleb {
    // 필드 더블 라디우스 은닉
    private double radius;

    public Circleb(double r) {
        radius = r;
    }
}

// 메인메서드 선언
public class Circle3 {
    public static void main(String[] args) {
        Circleb myCircle = new Circleb(10.0);
    }
}