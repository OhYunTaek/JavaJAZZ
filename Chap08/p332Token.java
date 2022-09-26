import java.util.StringTokenizer;

/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p332Token {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(s, " , ");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.print("[" + st.nextToken() + "]");
        }
    }
}