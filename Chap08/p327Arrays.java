import java.util.Arrays;

/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p327Arrays {
    public static void main(String[] args) {
        char[] a1 = { 'J', 'a', 'v', 'a' };
        char[] a2 = Arrays.copyOf(a1, a1.length);
        System.out.println(a2);

        String[] sa = { "삼겹살", "꽃등심", "티본스테이크", "살치살" };
        print(sa);

        Arrays.sort(sa);
        print(sa);

        System.out.println(Arrays.binarySearch(sa, "꽃등심"));

        Arrays.fill(sa, 2, 4, "기타");
        print(sa);
    }

    static void print(Object[] oa) {
        for (Object o : oa)
            System.out.print(o + " ");
        System.out.println();
    }
}