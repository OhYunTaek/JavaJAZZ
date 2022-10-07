import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 도전과제 p517
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P517EX3 {
    static int i = 0;

    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부",
                "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender3> genders = List.of(Gender3.남, Gender3.여, Gender3.남, Gender3.남,
                Gender3.남, Gender3.여);

        Stream<String> a3 = names.stream();
        a3.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();

        a3 = names.stream();
        a3.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        a3 = names.stream();
        System.out.println(a3.findFirst());

        a3 = names.stream();
        System.out.println(a3.findFirst().get());

        a3 = names.stream();
        System.out.println(a3.count());
        System.out.println();

        Stream<Integer> b3 = ages.stream();
        System.out.println(b3.reduce(0, (a, b) -> a + b));

        b3 = ages.stream();
        System.out.println(b3.max(Integer::compareTo).get());
        IntStream c3 = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(c3.average().getAsDouble());

        System.out.println(" ");
        System.out.println("[Member 스트림 원소]");

        a3 = names.stream();
        Stream<Member3> d3 = a3.map(n -> new Member3(n, genders.get(i), ages.get(i++)));
        d3.forEach(m -> System.out.print(m + " "));
        System.out.println();

        System.out.println(" ");
        System.out.println("[Member 스트림을 성별로 그룹핑]");

        i = 0;
        a3 = names.stream();
        d3 = a3.map(n -> new Member3(n, genders.get(i), ages.get(i++)));
        Map<Gender3, List<Member3>> map = d3.collect(Collectors.groupingBy(Member3::getGender));
        System.out.println(map);
    }
}

enum Gender3 {
    남, 여
}

class Member3 {
    String name;
    Gender3 gender;
    int age;

    public Member3(String name, Gender3 gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender3 getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }
}