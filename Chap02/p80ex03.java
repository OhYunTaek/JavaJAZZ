import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex03 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("원기둥 밑면 반지름 : ");
        a = in.nextDouble();
        System.out.printf("원기둥 높이");
        b = in.nextDouble();
        System.out.printf("원기둥 부피는 " + ((a * a) * b) + " 이다");
        c = in.nextDouble();
    }
}