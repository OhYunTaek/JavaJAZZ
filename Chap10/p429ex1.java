import java.util.Arrays;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p429ex1 {
    public static void main(String[] args) {
        String[] sa = { "K", "o", "r", "e", "a", "n" };

        System.out.print("정렬 전 : ");
        for (String s : sa)
            System.out.print(s + " ");
        System.out.println();

        // Arrays.sor(sa, (s1, s2) -> s1.compareToIgnoreCase(s3));
        Arrays.sort(sa, String::compareToIgnoreCase);

        System.out.print("정렬 후 : ");
        for (String s : sa)
            System.out.print(s + " ");
    }
}