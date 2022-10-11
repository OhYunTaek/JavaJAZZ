package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터 13 예제
public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";
        String output2 = "D:\\Temp\\dup2.txt";

        try (FileInputStream fis = new FileInputStream(input);
                FileOutputStream fos = new FileOutputStream(output)) {
            int c;

            while ((c = fis.read()) != -1)
                fos.write(c);
        } catch (IOException e) {

        }
    }
}