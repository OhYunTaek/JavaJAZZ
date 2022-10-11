import java.io.File;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 프로그래밍 문제
public class P563Ex1 {
    public static void main(String[] args) {
        File f = new File("D:\\temp\\file.txt");
        if (f.exists())
            System.out.println("found");
        else
            System.out.println("not found");
    }
}