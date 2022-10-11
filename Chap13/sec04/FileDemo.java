package sec04;

import java.io.*;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        for (File f : fs)
            if (f.isDirectory())
                System.out.printf("dir : %s\n", f);
            else
                System.out.printf("file: %s(%d bytes)\n", f, f.length());
    }
}