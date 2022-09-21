/**
 * Code By OhYunTaek. 2022.09.19(월)
 */

public class p186 {
    public static void main(String[] args) {
        int[] one2five = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int x = 0; x < one2five.length; x++)
            one2five[x]++;

        for (int x : one2five)
            sum += x;

        System.out.println("평균 = " + sum / 5.0);
    }
}