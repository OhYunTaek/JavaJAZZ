import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex7 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1, 5 };
        int[] b = { 3, 2, 4, 1 };
        int[] c = { 3, 2, 4, 1, 5 };
        int[] d = { 2, 7, 1, 8, 2 };

        if (equals(a, b))
            System.out.println("배열 a와 b의 내용은 같다.");
        if (equals(a, c))
            System.out.println("배열 a와 c의 내용은 같다.");
        if (equals(a, d))
            System.out.println("배열 a와 d의 내용은 같다.");
        if (equals(b, c))
            System.out.println("배열 b와 c의 내용은 같다.");
        if (equals(b, d))
            System.out.println("배열 b와 d의 내용은 같다.");
        if (equals(c, d))
            System.out.println("배열 c와 d의 내용은 같다.");
    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
}