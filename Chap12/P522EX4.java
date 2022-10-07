import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01.Nation;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX4 {
    public static void main(String[] args) {
        Stream<Nation> aa4 = Nation.nations.stream();
        String string = aa4
                .filter(Predicate.not(Nation::isIsland))
                .map(Nation::getName)
                .collect(Collectors.joining(", "));
        System.out.println(string);
    }
}