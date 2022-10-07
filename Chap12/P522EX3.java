import java.util.stream.IntStream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "A" + i)
                .forEach(s -> System.out.print(s + " "));
    }
}