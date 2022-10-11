import java.io.*;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class P563Ex5 {
    public static void main(String[] args) throws Exception {
        OutputStream os = System.out;

        for (byte b = 48; b < 58; b++)
            os.write(b);

        for (byte b = 65; b < 91; b++)
            os.write(b);

        os.close();
    }
}