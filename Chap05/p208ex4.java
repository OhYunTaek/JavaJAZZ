import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex4 {
    public static void main(String[] args) {
        String s;

        String a = "bye";
        String b = "'com'";
        String c = "'java'";

        do {
            System.out.print("URL을 입력 : ");
            Scanner in = new Scanner(System.in);
            s = in.next();

            if (s.endsWith(b)) {
                System.out.println(s + " 은 " + b + " 으로 끝납니다");
            }

            if (s.contains(c)) {
                System.out.println(s + " 은 " + c + " 를 포함합니다");
            }
        } while (!s.equals(a));
    }
}