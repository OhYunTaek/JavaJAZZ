/*
 * Code by OhYunTaek. 2022.09.16(금) 
 */

//클래스 멤버 접근 연습

// 클래스 선언
class Circle {
    // 초기화 안해서 기본값 0.0
    double radius;

    // 클래스 멤버 접근
    double findArea() {
        return 3.13 * radius * radius;
    }

    // 위에서 double을 선언했으니 똑같이 double을 호출
    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

// 메인클래스 선언
public class Circle1 {
    // 생성자 호출
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        // 객체의 필드 호출
        myCircle.radius = 10.0;
        // 메서드 호출
        myCircle.show(myCircle.radius, myCircle.findArea());
    }
}