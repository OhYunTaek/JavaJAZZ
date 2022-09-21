import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.19(월)
 */

public class p180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scores[] = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++)
            scores[i] = in.nextInt();

        for (int i = 0; i < scores.length; i++)
            sum += scores[i];

        System.out.println("평균 = " + sum / 5.0);
    }
}