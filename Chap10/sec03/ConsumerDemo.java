package sec03;

import java.util.function.*;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
        c1.accept("Java Functional Interface");

        BiConsumer<String, String> c2 = (x, y) -> System.out.println(x + " : " + y);
        c2.accept("Java", "Lambda");

        ObjIntConsumer<String> c3 = (s, x) -> {
            int a = Integer.parseInt(s) + x;
            System.out.println(a);
        };
        c3.accept("100", 50);

        IntConsumer c4 = x -> System.out.printf("%d * %d = %d\n", x, x, x * x);
        IntConsumer c5 = c4.andThen(x -> System.out.printf("%d + 10 = %d", x, x + 10));
        c5.accept(10);
    }
}