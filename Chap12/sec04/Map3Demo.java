package sec04;

import java.util.*;
import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p497
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Map3Demo {
    public static void main(String[] args) {
        List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
        Stream<String> s1 = list1.stream();
        Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));
        s2.forEach(Util::printWithParenthesis);
        System.out.println();

        List<String> list2 = List.of("좋은 아침");
        List<String> list3 = List.of("안녕! 람다", "환영! 스트림");

        Stream<List<String>> s3 = Stream.of(list1, list2, list3);

        Stream<String> s4 = s3.flatMap(list -> {
            if (list.size() > 1)
                return list.stream();
            else
                return Stream.empty();
        });
        s4.forEach(Util::printWithParenthesis);
    }
}