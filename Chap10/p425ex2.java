import java.util.ArrayList;
import java.util.List;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p425ex2 {
    public static void main(String[] args) {
        List<p424ex1_1> rectangles = findShapes(p424ex1_1.shapes,
                "사각형", null, null);
        System.out.print("사각형 : ");
        System.out.println(rectangles);
        List<p424ex1_1> redNSmallShapes = findShapes(p424ex1_1.shapes,
                null, "빨간색", 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(redNSmallShapes);
    }

    static List<p424ex1_1> findShapes(List<p424ex1_1> shapes, String type,
            String color, Double area) {

        List<p424ex1_1> result = new ArrayList<>();

        for (p424ex1_1 s : shapes) {
            if (type != null) {
                if (s.getType().equals(type))
                    result.add(s);
            } else {
                if (s.getColor().equals(color) && s.getArea() <= area)
                    result.add(s);
            }
        }
        return result;
    }
}