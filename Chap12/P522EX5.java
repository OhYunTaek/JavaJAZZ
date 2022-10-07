import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX5 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream.collect(Collectors.averagingInt(x -> x)));

        stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream.collect(Collectors.mapping(x -> x * x,
                Collectors.averagingDouble(x -> x))));

        stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream.map(x -> String.valueOf(x))
                .collect(Collectors.joining(", ")));
    }
}