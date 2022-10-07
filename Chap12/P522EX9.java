import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p523
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX9 {
    public static void main(String[] args) {
        Stream<int[]> triples = IntStream.range(1, 100).boxed()
                .flatMap(x -> IntStream.range(x, 100)
                        .filter(y -> Math.sqrt(x * x + y * y) % 1 == 0)
                        .mapToObj(y -> new int[] { x, y, (int) Math.sqrt(x * x + y * y) }));

        triples.limit(5)
                .forEach(t -> System.out.printf("(" + t[0] + ", " + t[1] + ", " + t[2] + ") "));
    }
}