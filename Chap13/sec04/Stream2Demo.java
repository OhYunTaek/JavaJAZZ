package sec04;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class Stream2Demo {
    public static void main(String[] args) throws Exception {
        String[] number = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine" };
        Path p = new File("D:\\Temp\\number.txt").toPath();
        Stream<String> s = Files.lines(p);

        s.forEach(x -> System.out.println(x));

        s = Files.lines(p);

        s.map(x -> number[Integer.parseInt(x)])
                .forEach(x -> System.out.print(x + " "));
    }
}