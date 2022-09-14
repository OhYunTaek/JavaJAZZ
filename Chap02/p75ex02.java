import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p75ex02 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        a = in.nextInt();
        System.out.printf((a % 2 == 0) ? "짝수" : "홀수");
    }
}