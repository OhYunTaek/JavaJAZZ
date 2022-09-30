import java.util.Arrays;
import java.util.List;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p425ex3_1 {
    private String type;
    private String color;
    private Double area;

    public p425ex3_1(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %.1f)", type, color, area);
    }

    static List<p425ex3_1> shapes = Arrays.asList(
            new p425ex3_1("삼각형", "빨간색", 10.5),
            new p425ex3_1("사각형", "파란색", 11.2),
            new p425ex3_1("원", "파란색", 16.5),
            new p425ex3_1("원", "빨간색", 5.3),
            new p425ex3_1("원", "노란색", 8.1),
            new p425ex3_1("사각형", "파란색", 20.7),
            new p425ex3_1("삼각형", "파란색", 3.4),
            new p425ex3_1("사각형", "빨간색", 12.6));
}