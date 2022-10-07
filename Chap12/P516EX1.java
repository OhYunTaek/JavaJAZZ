import java.util.List;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 도전과제 p516
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P516EX1 {
    public static void main(String[] args) {
        Stream<String> a1;
        List<String> names = List.of("홍길동", "배장화", "연흥부",
                "김선달", "황진이");

        a1 = names.stream();
        a1.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));

        System.out.println();
        a1 = names.stream();
        a1.sorted().forEach(n -> System.out.print(n + " "));

        System.out.println();
        a1 = names.stream();
        System.out.println(a1.findFirst());

        a1 = names.stream();
        System.out.println(a1.findFirst().get());

        a1 = names.stream();
        System.out.println(a1.count());
    }
}