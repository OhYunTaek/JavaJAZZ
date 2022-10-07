import java.util.List;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 프로그래밍 문제 p522
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P522EX6 {
    static int i = 0;

    public static void main(String[] args) {
        List<String> capitals6 = List.of("서울", "워싱턴", "베이징", "파리",
                "마드리드", "런던");
        List<Double> populations6 = List.of(973.7, 63.2, 2115.0, 224.4,
                326.5, 853.9);

        Stream<Population> stream = capitals6.stream()
                .map(c -> new Population(c, populations6.get(i++)));
        stream.filter(p -> p.getPops() > 300.0).forEach(System.out::println);
    }
}

class Population {
    String capital;
    Double pops;

    public Population(String capital, Double pops) {
        this.capital = capital;
        this.pops = pops;
    }

    public String getCapital() {
        return capital;
    }

    public Double getPops() {
        return pops;
    }

    @Override
    public String toString() {
        return String.format("%s(%.1f)", capital, pops);
    }
}