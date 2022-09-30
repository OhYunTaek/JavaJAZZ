import java.util.function.Consumer;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p429ex3 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(
                x == 1 ? "1 apple" : x.toString() + " apples");

        consumer.accept(3);
        consumer.accept(1);
    }
}