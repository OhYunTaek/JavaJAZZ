import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p86If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("짝수");
        if (number % 2 == 1)
            System.out.println("홀수");
        System.out.println("종료");
    }
}