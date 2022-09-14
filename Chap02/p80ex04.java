import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex04 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("초 단위 정수 입력 : ");
        a = in.nextInt();
        int remainder = a % 60;
        System.out.printf(a / 360 + "시간 " + a / 60 + "분 " + remainder + "초");
        b = in.nextInt();
    }
}