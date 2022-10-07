package sec02;

import java.util.Random;
import java.util.stream.*;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p483
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Etc2StreamDemo {
    public static void main(String[] args) {
        IntStream is1 = IntStream.iterate(1, x -> x + 2);

        IntStream is2 = new Random().ints(0, 10);

        Stream<Double> ds = Stream.generate(Math::random);

        IntStream is3 = IntStream.range(1, 5);
    }
}