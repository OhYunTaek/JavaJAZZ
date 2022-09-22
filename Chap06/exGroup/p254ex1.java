package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

public class p254ex1 {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        Girl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

        gg.show();
    }
}

class Girl {
    private String name;
}

class GoodGirl extends Girl {
    void show() {
        System.out.println("그녀는 자바를 잘 안다.");
    }
}

class BestGirl extends GoodGirl {
    @Override
    void show() {
        System.out.println("그녀는 자바의 고수다");
    }
}