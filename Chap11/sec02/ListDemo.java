package sec02;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals1 = { "돌고래", "범고래", "혹등고래", "흰긴수염고래" };

        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "금화조");

        for (String s : animals2)
            System.out.print(s + " ");
        System.out.println();

        animals2.sort((x, y) -> x.length() - y.length());
        String[] animals3 = animals2.toArray(new String[0]);
        for (int i = 0; i < animals3.length; i++)
            System.out.print(animals3[i] + " ");
        System.out.println();

        List<String> cars = List.of("티코", "마티즈", "캐스퍼", "아우디R8");
        cars.forEach(s -> System.out.print(s + " "));
    }
}