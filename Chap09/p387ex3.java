import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p387ex3 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showToken(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        } catch (Exception e) {
            System.out.println("읔엑!!");
        }
    }

    static void showToken(String s1, String s2) {
        StringTokenizer st = new StringTokenizer(s1, s2);
        while (true) {
            System.out.println(st.nextToken());
        }
    }
}