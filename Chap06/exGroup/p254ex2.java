package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

public class p254ex2 {
    public static void main(String[] args) {
        Girl2 g1 = new Girl2();
        Girl2 g3 = new GoodGirl2();
        GoodGirl2 gg = new BestGirl2();

        g3.show();
        gg.show();
    }
}

class Girl2 {
    private String name;

    public Girl2() {
    }

    public Girl2(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("그녀는 자바 초보자이다.");
    }
}

class GoodGirl2 extends Girl2 {
    @Override
    void show() {
        System.out.println("그녀는 자바를 잘 안다.");
    }
}

class BestGirl2 extends GoodGirl2 {
    @Override
    void show() {
        System.out.println("그녀는 자바를 고수다.");
    }
}