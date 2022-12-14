package sec03;

import java.util.stream.*;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p485
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Laziness1Demo {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1, 5);

        is.filter(x -> {
            System.out.println("filter : " + x);
            return x % 2 == 0;
        }).map(x -> {
            System.out.println("map : " + x);
            return x * x;
        });
    }
}