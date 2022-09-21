import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex6 {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        int n = nums.length;
        int[] newNums = new int[n];

        newNums = reverse(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(newNums[i] + " ");
        }
    }

    public static int[] reverse(int[] org) {
        int n = org.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[n - i - 1] = org[i];
        }

        return nums;
    }
}