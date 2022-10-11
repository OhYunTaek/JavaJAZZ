package sec03;

import java.io.*;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class PrintWriterDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\Temp\\org.txt"));
                PrintWriter pr = new PrintWriter(
                        new FileWriter("D\\Temp\\dup.txt"));) {
            br.lines().forEach(x -> pr.println(x));
        } catch (IOException e) {

        }
    }
}