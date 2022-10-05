import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Code By OhYunTaek. 2022.10.05
 */
public class p463ex1 {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("서울");
        capitals.add("부에노스아이레스");
        capitals.add("코펜하겐");
        capitals.add("브라질리아");
        capitals.add("브뤼셀");

        for (String capital : capitals)
            System.out.print(capital + " ");
        System.out.println();

        capitals.add("카이로");
        Iterator<String> i = capitals.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println();

        capitals.removeIf(s -> s.length() > 3);
        capitals.forEach(s -> System.out.print(s + " "));
    }
}