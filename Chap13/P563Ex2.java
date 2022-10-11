import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class P563Ex2 {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        boolean cont = true;
        String line = null;

        while (cont) {
            System.out.print("input line : ");
            try {
                line = br.readLine();
            } catch (Exception e) {
            }
            if (line.length() == 0)
                break;
            System.out.println("output : " + line);
        }
    }
}