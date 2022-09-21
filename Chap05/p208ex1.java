import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("아무 단어나 입력 : ");
        String s = in.nextLine();
        System.out.print("몇 개 인지 찾을 문자 입력 : ");
        char c = in.next().charAt(0);

        System.out.println(countChar(s, c));
    }

    static int countChar(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                n++;
        }
        return n;
    }
}
