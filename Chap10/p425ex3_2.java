import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p425ex3_2 {
    public static void main(String[] args) {
        List<p425ex3_1> rectangles = findShapes(p425ex3_1.shapes,
                s -> s.getType().equals("사각형"));
        System.out.print("사각형 : ");
        System.out.println(rectangles);
        List<p425ex3_1> redNSmallShapes = findShapes(p425ex3_1.shapes,
                s -> s.getColor().equals("빨간색") && s.getArea() <= 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(redNSmallShapes);
    }

    static List<p425ex3_1> findShapes(List<p425ex3_1> animals, Predicate<p425ex3_1> p) {
        List<p425ex3_1> result = new ArrayList<>();

        for (p425ex3_1 a : animals)
            if (p.test(a))
                result.add(a);
        return result;
    }
}