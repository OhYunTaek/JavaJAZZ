import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01.Nation;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p523
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX8 {
    public static void main(String[] args) {
        Stream<Nation> a8 = Nation.nations.stream();
        Map<Nation.Type, Map<String, List<Nation>>> m1 = a8
                .collect(Collectors.groupingBy(Nation::getType, Collectors.groupingBy(
                        n -> {
                            if (n.getGdpRank() < 12)
                                return "선진국";
                            else
                                return "개도국";
                        })));
        System.out.println(m1);
    }
}