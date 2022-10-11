import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class P564Ex7 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = in.nextLine();
        System.out.print("세고자 하는 문자를 입력하세요 : ");
        char lookFor = in.nextLine().charAt(0);

        int count = new CountLetter1(lookFor, fileName).count();
        System.out.format("%s 파일에 %c 문자가 %d개%n", fileName, lookFor, count);
    }
}

class CountLetter1 {
    private char lookFor;
    private Path file;

    CountLetter1(char lookFor, String fileName) {
        this.lookFor = lookFor;
        file = Paths.get(fileName);
    }

    public int count() throws IOException {
        int count = 0;
        try (InputStream in = Files.newInputStream(file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (lookFor == line.charAt(i)) {
                        count++;
                    }
                }
            }
        } catch (IOException x) {
        }
        return count;
    }
}