import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p523
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX7 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("민국", "지우", "하준", "지우", "하준", "지우");
        Map<String, Long> freq = names
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(freq);
    }
}