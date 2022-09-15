import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p86IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int number = in.nextInt();

        // if문 대신에 else를 활용할 수 있음
        // if (number % 2 == 0)
        // System.out.println("짝수");
        // else
        // System.out.println("홀수");

        // 한 줄로 간결하게 표현가능
        System.out.println(number % 2 == 0 ? "짝수" : "홀수");

        System.out.println("종료");
    }

}