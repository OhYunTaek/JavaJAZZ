package sec02;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = List.of("티코", "마티즈", "캐스퍼", "아우디R8");

        System.out.println(list.indexOf("마티즈"));
        System.out.println(list.contains("모닝"));

        List<String> cars1 = new ArrayList<>(list);
        cars1.add("모닝");
        List<String> cars2 = new ArrayList<>(list);
        cars2.remove("아우디R8");
        System.out.println(cars1.containsAll(cars2));

        cars1.removeIf(c -> c.startsWith("마"));
        cars1.replaceAll(s -> "뉴" + s);
        cars1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        cars1.clear();
        System.out.println(cars1.isEmpty());
    }
}