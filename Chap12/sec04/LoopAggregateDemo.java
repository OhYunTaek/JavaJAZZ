package sec04;

import java.util.*;
import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p502
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class LoopAggregateDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream()
                .peek(Util::printWithParenthesis);
        System.out.println("어디 나타날까?");
        Optional<Nation> on = sn
                .max(Comparator.comparing(Nation::getPopulation));
        System.out.println();
        System.out.println(on.get());

        System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());

        sn = Nation.nations.stream();
        System.out.println(sn.count());
    }
}