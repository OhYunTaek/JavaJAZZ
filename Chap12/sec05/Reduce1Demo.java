package sec05;

import java.util.*;
import java.util.stream.*;

import sec01.*;

/*
 * Code By OhYunTaek 2022.10.06(목)
 */
// p504
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Reduce1Demo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 1, 2);

        int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        int mul1 = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(mul1);

        Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
        OptionalInt sum4 = numbers.stream()
                .mapToInt(x -> x.intValue()).reduce(Integer::sum);
        Optional<Integer> mul2 = numbers.stream().reduce((a, b) -> a * b);

        System.out.println(sum3.get());
        System.out.println(sum4.getAsInt());
        mul2.ifPresent(Util::print);
    }
}