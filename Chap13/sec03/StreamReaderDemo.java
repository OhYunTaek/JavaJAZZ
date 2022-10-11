package sec03;

import java.io.*;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class StreamReaderDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";

        try (FileInputStream fi = new FileInputStream(input);
                InputStreamReader in = new InputStreamReader(fi, "US-ASCII")) {
            int c;

            System.out.println(in.getEncoding());
            while ((c = in.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
        }
    }
}