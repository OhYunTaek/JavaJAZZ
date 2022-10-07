import java.util.List;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX1 {
    public static void main(String[] args) {
        List<String> animals1 = List.of("갈매기", "나비", "다람쥐", "라마");
        animals1.stream().filter(a -> a.length() == 2).forEach(System.out::println);
    }
}