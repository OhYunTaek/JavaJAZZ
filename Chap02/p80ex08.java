import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex08 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이 아무 숫자 입력 : ");
        a = in.nextInt();
        b = a / 100;
        c = (a % 100) / 10;
        d = (a % 100) % 10;
        System.out.printf("각 자릿수의 합 = " + (b + c + d));
    }
}