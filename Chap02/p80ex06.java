import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex06 {
    public static void main(String[] args) {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도 입력 : ");
        a = in.nextDouble();
        System.out.println(5.0 / 9.0 * (a - 32));
        b = in.nextDouble();
    }
}