package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

public class p254ex3 {
    public static void main(String[] args) {
        Girl3[] girls = { new Girl3("태권V"), new GoodGirl3("마징가Z"), new BestGirl3("철인28호") };

        for (Girl3 g : girls)
            g.show();
    }
}

class Girl3 {
    protected String name;

    public Girl3(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + "는 태권도 흰 띠다.");
    }
}

class GoodGirl3 extends Girl3 {

    public GoodGirl3(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(name + "는 싸움을 잘 한다.");
    }
}

class BestGirl3 extends GoodGirl3 {

    public BestGirl3(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println(name + "는 싸움의 고수다.");
    }
}