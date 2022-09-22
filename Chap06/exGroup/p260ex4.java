package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

class Parent {
    String name = "자연인";

    void print() {
        System.out.println("나는 자연인이 아니다.");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("나는 자연인이다.");
    }
}

public class p260ex4 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        p.print();
    }
}