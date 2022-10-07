package sec05;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p509
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Collect3Demo {
        public static void main(String[] args) {
                Stream<Nation> sn1 = Nation.nations.stream();
                Stream<String> ss = sn1
                                .map(Nation::getName)
                                .limit(3);
                List<String> list = ss
                                .collect(Collectors.toList());
                System.out.println(list);

                sn1 = Nation.nations.stream();
                Set<String> set = sn1
                                .map(Nation::getName)
                                .limit(3)
                                .collect(Collectors.toSet());
                System.out.println(set);

                sn1 = Nation.nations.stream();
                Map<String, Double> map = sn1
                                .filter(Nation::isIsland)
                                .collect(Collectors.toMap(Nation::getName,
                                                Nation::getPopulation));
                System.out.println(map);

                Stream<Nation> sn = Nation.nations.stream();
                Set<Nation> hashSet = sn
                                .filter(Predicate.not(Nation::isIsland))
                                // .collect(Collectors.toCollection(HashSet<Nation>::new));
                                .collect(Collectors.toCollection(() -> new HashSet<Nation>()));

                hashSet.forEach(x -> Util.print("(" + x.getName() + ", " +
                                x.getGdpRank() + ")"));
        }
}