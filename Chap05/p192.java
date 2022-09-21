/**
 * Code By OhYunTaek. 2022.09.20(화)
 */

// 두번째 입력구간_1
class Circle5 {

    // 다섯번째 입력구간
    double radius;

    // 세번째 입력구간
    public Circle5(double radius) {
        this.radius = radius;
    }

    // 여섯번째 입력구간
    // 이 부분이 없어도 결괏값은 똑같이 출력이 된다
    public double getRadius() {
        return radius;
    }

    // 네번째 입력구간
    double findArea() {
        return 3.14 * radius * radius;
    }

    // 두번째 입력구간_2
}

// 첫번째 입력구간
public class p192 {
    public static void main(String[] args) {
        Circle5[] circles = new Circle5[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle5(i + 1.0);
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n",
                    circles[i].radius, circles[i].findArea());
        }
    }
}