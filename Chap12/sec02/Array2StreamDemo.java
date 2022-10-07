package sec02;

import java.util.*;
import java.util.stream.*;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p482
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Array2StreamDemo {
    public static void main(String[] args) {
        int[] ia = { 2, 3, 5, 7, 11, 13 };
        IntStream is = Arrays.stream(ia);

        String[] strings = { "The", "pen", "is", "mighter", "than", "the", "sword" };
        Stream<String> ss = Stream.of(strings);

        double[] da = { 1, 2, 3.14, 5.8, 0.2 };
        DoubleStream ds = DoubleStream.of(da);
    }
}