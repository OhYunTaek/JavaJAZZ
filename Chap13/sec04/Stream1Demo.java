package sec04;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class Stream1Demo {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        Stream<File> stream = Arrays.stream(fs);
        long count = stream.filter(x -> x.isDirectory() == false).count();
        System.out.println("C:\\Windows에 있는 파일 개수 : " + count);
    }
}