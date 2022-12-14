package sec02;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("홍삼", "산삼", "연봉1억");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "-");
        System.out.println();

        while (iterator.hasNext())
            System.out.print(iterator.next() + "+");
        System.out.println();

        iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "=");
    }
}