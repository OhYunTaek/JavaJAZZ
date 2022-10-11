package sec03;

import java.io.*;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터 13 예제
public class CopyFile2Demo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";

        try (FileReader fr = new FileReader(input);
                FileWriter fw = new FileWriter(output)) {
            int c;

            while ((c = fr.read()) != -1)
                fw.write(c);
        } catch (IOException e) {

        }
    }
}