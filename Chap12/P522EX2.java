import java.util.List;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX2 {
    public static void main(String[] args) {
        List<String> capitals2 = List.of("서울", "워싱턴", "베이징", "파리",
                "마드리드", "런던");

        Stream<String> aa2 = capitals2.stream();
        System.out.println(aa2.sorted().findFirst().get());
    }
}