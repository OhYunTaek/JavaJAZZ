/*
 * Code by OhYunTaek. 2022.09.16(금) 
 */

//getter와 setter 연습

// 클래스 선언
class Circlea {
    // 필드 더블 라디우스 은닉
    private double radius;

    // getter 로 가져오기
    public double getRadius() {
        return radius;
    }

    // setter 로 변수 설정하기
    public void setRadius(double r) {
        this.radius = r;
    }

    // 클래스 멤버에 접근
    double findArea() {
        return 3.14 * radius * radius;
    }

    // 출력 메서드 호출
    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

// 메인메서드 선언
public class Circle2 {
    public static void main(String[] args) {
        Circlea myCircle = new Circlea();
        // setter 로 변수 설정하기
        myCircle.setRadius(10.0);
        // getter 로 필드 메서드 지정
        myCircle.show(myCircle.getRadius(), myCircle.findArea());
    }
}