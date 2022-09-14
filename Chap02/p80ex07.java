import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p80ex07 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        a = in.nextInt();

        // 4와 5로 나누어지는가
        System.out.println(a % 5 == 0 && a % 4 == 0);
        // 4또는 5로 나누어지는가
        System.out.println(a % 5 == 0 ^ a % 4 == 0);
        // 4나 5중 하나로 나누어지는데 두 수 모두로 나누어지지 않는가
        System.out.println(a % 5 == 0 || a % 4 == 0);
    }
}