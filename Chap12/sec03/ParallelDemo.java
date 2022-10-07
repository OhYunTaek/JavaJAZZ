package sec03;

import java.util.stream.*;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p488
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class ParallelDemo {
    public static void main(String[] args) {
        long start, end, total;

        IntStream sequantial = IntStream.rangeClosed(1, 1000000000);
        start = System.currentTimeMillis();
        total = sequantial.sum();
        end = System.currentTimeMillis();
        System.out.println("순차 처리 : " + (end - start));

        IntStream parallel = IntStream.rangeClosed(1, 1000000000).parallel();
        start = System.currentTimeMillis();
        total = parallel.sum();
        end = System.currentTimeMillis();
        System.out.println("병렬 처리 : " + (end - start));
    }
}