import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("입력 : ");
        String s = in.nextLine();

        StringTokenizer st = new StringTokenizer(s);
        String[] a = new String[st.countTokens()];

        System.out.println("단어 개수 : " + st.countTokens());

        System.out.print("정렬된 토큰 : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = st.nextToken();
        }

        Arrays.sort(a);

        for (String s1 : a)
            System.out.print(s1 + ", ");
    }
}