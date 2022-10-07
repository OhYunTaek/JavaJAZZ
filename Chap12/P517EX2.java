import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Code By OhYunTaek 2022.10.07(금)
 */
// 챕터12 도전과제 p517
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class P517EX2 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부",
                "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남,
                Gender.남, Gender.여);

        Stream<String> a2 = names.stream();
        a2.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();

        a2 = names.stream();
        a2.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        a2 = names.stream();
        System.out.println(a2.findFirst());

        a2 = names.stream();
        System.out.println(a2.findFirst().get());

        a2 = names.stream();
        System.out.println(a2.count());
        System.out.println();

        Stream<Integer> b2 = ages.stream();
        System.out.println(b2.reduce(0, (a, b) -> a + b));

        b2 = ages.stream();
        System.out.println(b2.max(Integer::compareTo).get());

        IntStream c2 = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(c2.average().getAsDouble());
    }
}

enum Gender {
    남, 여
}

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}