import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("숫자를 10개 입력하세요.");

        int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();
            if (0 <= n && n < 10) {
                count[0]++;
            } else if (10 <= n && n < 20) {
                count[1]++;
            } else if (20 <= n && n < 30) {
                count[2]++;
            } else if (30 <= n && n < 40) {
                count[3]++;
            } else if (40 <= n && n < 50) {
                count[4]++;
            } else if (50 <= n && n < 60) {
                count[5]++;
            } else if (60 <= n && n < 70) {
                count[6]++;
            } else if (70 <= n && n < 80) {
                count[7]++;
            } else if (80 <= n && n < 90) {
                count[8]++;
            } else if (90 <= n && n < 100) {
                count[9]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print((i * 10) + " ~ " + (i * 10 + 9) + " : ");
            for (int j = 0; j < count[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}