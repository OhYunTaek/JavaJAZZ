import java.util.Scanner;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p362Throws1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        try {
            square(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("정수가 아닙니다");
        }
    }

    private static void square(String s) throws NumberFormatException {
        int n = Integer.parseInt(s);
        System.out.println(n * n);
    }
}