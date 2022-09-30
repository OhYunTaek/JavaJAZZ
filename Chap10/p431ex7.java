import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p431ex7 {
    public static void main(String[] args) {
        System.out.println("평균 신장 : " + average(Person.persons, p -> p.getHeight()));
        System.out.println("평균 체중 : " + average(Person.persons, p -> p.getWeight()));
    }

    public static double average(List<Person> all, Function<Person, Integer> f) {
        double sum = 0.0;

        for (Person p : all)
            sum += f.apply(p);
        return sum / all.size();
    }
}

class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45),
            new Person("이순신", 190, 110),
            new Person("김삿갓", 218, 160),
            new Person("홍길동", 185, 85),
            new Person("배장화", 177, 53));
}