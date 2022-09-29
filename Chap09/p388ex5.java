import java.util.ArrayList;
import java.util.List;

/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p388ex5 {
    static <T extends Animal> void printSouond(List<T> a) {
        for (T list : a)
            list.sound();
    }

    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSouond(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSouond(dogs);
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cuckoo implements Animal {

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}