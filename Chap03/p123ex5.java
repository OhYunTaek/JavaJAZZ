import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//for 문 중첩 연습
//피타고라스 사용하라
public class p123ex5 {
    public static void main(String[] args) {
        int a, b, c;

        // 직각삼각형 각 변 a, b, c 로 임의의 수 대입
        // 직각된 두 변 a와 b의 제곱 합이 c제곱이다
        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                for (c = 1; c < 10; c++) {
                    if ((a * a + b * b == c * c) && (a + b + c <= 20)) {
                        System.out.printf("a = %d b = %d c = %d", a, b, c);
                        System.out.println();
                    }
                }
            }
        }
    }
}