import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 도전과제
public class P559Ex3 {
    public static void main(String[] args) {
        String fileName = "D:\\temp\\file.txt";

        try {
            Files.lines(new File(fileName).toPath()).forEach(l -> System.out.println(l));
        } catch (FileNotFoundException ex) {
            System.out.println(fileName + " 파일을 열 수 없습니다");
        } catch (IOException ex) {
            System.out.println(fileName + " 파일을 읽을 수 없습니다");
        }
    }
}