package sec03;

import java.io.*;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터 13 예제
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\Temp\\org.txt"));) {
            br.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {

        }
    }
}