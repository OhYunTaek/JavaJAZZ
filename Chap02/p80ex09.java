import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex09 {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int a, b, c;

        System.out.printf("전공과목 이수 학점 : ");
        a = oh.nextInt();

        System.out.printf("교양과목 이수 학점 : ");
        b = oh.nextInt();

        System.out.printf("일반과목 이수 학점 : ");
        c = oh.nextInt();

        if (140 <= (a + b + c)) {
            if (a >= 70 && (b >= 30) || b + c >= 80) {
                System.out.println("졸업을 축하해요");
            }
        } else
            System.out.println("다음학기에 또 만나요");
    }
}