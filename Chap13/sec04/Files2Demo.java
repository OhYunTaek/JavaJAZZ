package sec04;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class Files2Demo {
    public static void main(String[] args) throws Exception {
        Charset cs = Charset.defaultCharset();
        Path p = new File("D:\\Temp\\new.txt").toPath();

        if (Files.notExists(p))
            Files.createFile(p);

        byte[] data = "Good Morning!\nGood Bye!\n".getBytes();
        Files.write(p, data, StandardOpenOption.APPEND);

        try {
            List<String> lines = Files.readAllLines(p, cs);

            for (String line : lines)
                System.out.println(line);
        } catch (IOException e) {
        }
    }
}