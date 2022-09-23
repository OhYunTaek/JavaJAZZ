/*
 * Code By OhYunTaek 2022.09.23(금)
 */
interface Countable {
    void count();
}

class Bird1 implements Countable {
    String name;

    Bird1(String name) {
        this.name = name;
    }

    public void count() {
        System.out.println(name + "가 2마리 있다");
    }

    void fly() {
        System.out.println("2마리 " + name + "가 날아간다");
    }
}

class Tree implements Countable {
    String name;

    Tree(String name) {
        this.name = name;
    }

    public void count() {
        System.out.println(name + "가 5그루 있다");
    }

    void ripen() {
        System.out.println(name + "에 열매가 잘 익었다");
    }
}

public class p296ex1 {
    public static void main(String[] args) {
        Countable[] m = { new Bird1("뻐꾸기"), new Bird1("독수리"),
                new Tree("사과 나무"), new Tree("복숭아 나무") };

        for (Countable e : m)
            e.count();
    }
}