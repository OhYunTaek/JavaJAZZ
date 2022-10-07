package sec05;

import java.util.*;
import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p512
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class GroupingDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, List<Nation>> m1 = sn
                .collect(Collectors.groupingBy(Nation::getType));
        System.out.println(m1);

        sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, Long> m2 = sn
                .collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
        System.out.println(m2);

        sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, String> m3 = sn.collect(
                Collectors.groupingBy(Nation::getType,
                        Collectors.mapping(Nation::getName,
                                Collectors.joining("#"))));
        System.out.println(m3);
    }
}