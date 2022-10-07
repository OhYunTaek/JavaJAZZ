package sec03;

import java.util.*;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p490
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Optional1Demo {
    public static OptionalDouble divide(double x, double y) {
        return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
    }

    public static void main(String[] args) {
        OptionalInt i = OptionalInt.of(100);
        OptionalDouble d = OptionalDouble.of(3.14);
        Optional<String> s = Optional.of("apple");

        System.out.println(i.getAsInt());
        System.out.println(d.getAsDouble());
        System.out.println(s.get());

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);

        System.out.println(divide(1.0, 2.0));
        System.out.println(divide(1.0, 0.0));
    }
}