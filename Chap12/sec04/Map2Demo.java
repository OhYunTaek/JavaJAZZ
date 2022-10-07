package sec04;

import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p496
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Map2Demo {
    public static void main(String[] args) {
        Stream<Nation> n1 = Nation.nations.stream();
        Stream<String> s1 = n1.map(Nation::getName);
        s1.limit(4).forEach(Util::printWithParenthesis);
        System.out.println();

        Stream<Nation> n2 = Nation.nations.stream();
        IntStream is = n2.mapToInt(Nation::getGdpRank);
        is.forEach(Util::print);
    }
}