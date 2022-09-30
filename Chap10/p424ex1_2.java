import java.util.ArrayList;
import java.util.List;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p424ex1_2 {
    public static void main(String[] args) {
        List<p424ex1_1> rectangles = findShapesByType(p424ex1_1.shapes,
                "사각형");
        System.out.print("사각형 : ");
        System.out.println(rectangles);
        List<p424ex1_1> redNSmallShapes = findShapesByColorNArea(p424ex1_1.shapes,
                "빨간색", 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(redNSmallShapes);
    }

    static List<p424ex1_1> findShapesByType(List<p424ex1_1> shapes, String type) {
        List<p424ex1_1> result = new ArrayList<>();

        for (p424ex1_1 s : shapes) {
            if (s.getType().equals(type))
                result.add(s);
        }
        return result;
    }

    static List<p424ex1_1> findShapesByColorNArea(List<p424ex1_1> shapes,
            String color, Double area) {
        List<p424ex1_1> result = new ArrayList<>();

        for (p424ex1_1 s : shapes) {
            if (s.getColor().equals(color) && s.getArea() <= area)
                result.add(s);
        }
        return result;
    }
}