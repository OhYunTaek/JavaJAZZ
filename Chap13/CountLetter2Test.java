import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class CountLetter2Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = in.nextLine();
        System.out.print("세고자 하는 문자를 입려하세요 : ");
        char lookFor = in.nextLine().charAt(0);

        int count = new CountLetter2(lookFor, fileName).count();
        System.out.format("%s 파일에 %c 문자가 %d개%n", fileName, lookFor, count);
    }
}

class CountLetter2 {
    private char lookFor;
    private Path file;

    CountLetter2(char lookFor, String fileName) {
        this.lookFor = lookFor;
        file = Paths.get(fileName);
    }

    public int count() throws IOException {
        int count = 0;

        FileChannel fc = FileChannel.open(file, StandardOpenOption.READ);
        ByteBuffer buf = ByteBuffer.allocate(10);

        while (fc.read(buf) != -1) {
            buf.flip();
            for (int i = 0; i < buf.limit(); i++) {
                if (lookFor == buf.get(i)) {
                    count++;
                }
            }
            buf.clear();
        }
        return count;
    }
}