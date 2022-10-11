import java.io.*;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class P564Ex6 {
    public static void main(String[] args) throws Exception {
        String[] animals = { "ant", "bat", "cat", "dog" };
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\print.txt");
        PrintStream ps = new PrintStream(fos);

        for (int i = 0; i < animals.length; i++) {
            // ps.printf("%c : %s", (char) (48 + i), animals[i]);
            ps.printf("%c : %s", animals[i].charAt(0), animals[i]);
            ps.println();
        }

        ps.close();
        fos.close();
    }
}